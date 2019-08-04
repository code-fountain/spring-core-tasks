package com.codefountain.spring.core.javaconfig.scope;

public class Product {

    private String productId;
    private String productDesc;

    public Product(String productId, String productDesc) {
        this.productId = productId;
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
