package com.prafull.poc.product.dao.repository;

import com.prafull.poc.product.dao.entity.Product;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProductDummyCache implements ProductDao {

    public Map<Integer, Product> PRODUCT_MAP = new HashMap<>();

    @PostConstruct
    private void cacheDataSetup() {
        Product productA = new Product(1, "Product-A", 10.00);
        PRODUCT_MAP.put(1, productA);
        Product productB = new Product(2, "Product-B", 20.00);
        PRODUCT_MAP.put(2, productB);
        Product productC = new Product(3, "Product-C", 30.00);
        PRODUCT_MAP.put(3, productC);
    }

    @Override
    public Product findById(Integer id) {
        return PRODUCT_MAP.get(id);
    }
    @Override
    public void save(Product product){
        PRODUCT_MAP.put(product.getProductId(),product);
    }

    public Map<Integer,Product> getAllProducts(){
        return PRODUCT_MAP;
    }

}
