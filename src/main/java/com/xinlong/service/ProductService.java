package com.xinlong.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xinlong.bean.Product;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
public interface ProductService extends IService<Product> {

    void addProduct(Product product);
    List<Product> getProducts();
    Page<Product> getProductsByPage();
    Product getProductById(Long id);


}
