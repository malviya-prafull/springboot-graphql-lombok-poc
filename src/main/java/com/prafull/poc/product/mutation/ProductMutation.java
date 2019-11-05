package com.prafull.poc.product.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.prafull.poc.product.dao.entity.Product;
import com.prafull.poc.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMutation implements GraphQLMutationResolver {

    @Autowired
    private ProductService productService;

    public Product createProduct(final Integer productId, final String productName, final Double productPrice) {
        return this.productService.createVehicle(productId,productName,productPrice);
    }
}
