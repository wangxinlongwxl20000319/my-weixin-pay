package com.xinlong.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinlong.bean.Product;
import com.xinlong.dao.ProductMapper;
import com.xinlong.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public void addProduct(Product product) {
       productMapper.insert(product);
    }

    @Override
    public List<Product> getProducts()
    {
        return productMapper.selectList(null);
    }

    @Override
    public Page<Product> getProductsByPage() {
        Page<Product> page=new Page<>(1,1);
        Page<Product> selectPage = productMapper.selectPage(page, null);
        return selectPage;
    }

    @Override
    public Product getProductById(Long id) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("pid",id);

        return  productMapper.selectOne(queryWrapper);
    }


}
