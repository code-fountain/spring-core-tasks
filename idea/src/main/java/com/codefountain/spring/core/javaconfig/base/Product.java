package com.codefountain.spring.core.javaconfig.base;

public class Product {

    private String productId;
    private String productDesc;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
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
