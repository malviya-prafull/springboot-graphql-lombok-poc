package com.prafull.poc.product.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private Integer productId;
    private String productName;
    private Double productPrice;

}
