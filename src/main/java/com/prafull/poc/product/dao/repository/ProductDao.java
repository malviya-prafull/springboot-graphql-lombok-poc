package com.prafull.poc.product.dao.repository;

import com.prafull.poc.product.dao.entity.Product;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface ProductDao {
    Product findById(Integer id);

    void save(Product product);

    Map<Integer,Product> getAllProducts();
}
