package com.prafull.poc.product.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.prafull.poc.product.ProductService;
import com.prafull.poc.product.dao.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQuery implements GraphQLQueryResolver {

    @Autowired
    private ProductService productService;

    public List<Product> getProducts(final int count) {
        return this.productService.getAllProducts(count);
    }

    public Product getProduct(final int id) {
        return this.productService.getProduct(id);
    }
}
