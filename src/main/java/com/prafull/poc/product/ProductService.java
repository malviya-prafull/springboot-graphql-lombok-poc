package com.prafull.poc.product;

import com.prafull.poc.product.dao.entity.Product;
import com.prafull.poc.product.dao.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductService {
    @Autowired
    private ProductDao productRepository ;

    public Product createVehicle(final Integer productId, final String productName, final Double productPrice) {
        final Product product = new Product(productId,productName,productPrice);
        this.productRepository.save(product);
        return product;
    }

    public List<Product> getAllProducts(final int count) {
        return this.productRepository.getAllProducts().values().stream().limit(count).collect(Collectors.toList());
    }

    public Product getProduct(final int id) {
        return this.productRepository.findById(id);
    }
}
