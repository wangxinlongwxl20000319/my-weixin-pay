package com.xinlong.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinlong.bean.Product;
import com.xinlong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
@RequestMapping("/list")
    public List<Product> getProducts(){
    return productService.getProducts();
}
    @RequestMapping("/pagelist")
    public PageInfo<Product> getPageProducts(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Product> products = productService.getProducts();
        PageInfo<Product> pageInfo=new PageInfo<>(products);
        return pageInfo;
    }
    @RequestMapping("/page")
    public Page<Product> getProductsByPage(){
    return productService.getProductsByPage();
    }

    @RequestMapping("/getProductById")
   public Product getProductById(Long pid){
    return productService.getProductById(pid);
    }

}

