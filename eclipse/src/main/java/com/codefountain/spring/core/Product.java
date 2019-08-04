package com.codefountain.spring.core;

import java.beans.ConstructorProperties;

public class Product {
	
	private String productId;
	private String productName;
	private String productDesc;
	
	@ConstructorProperties({"productId", "productName", "productDescription"})
	public Product(String productId, String productName, String productDesc) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ "]";
	}
	
	

}
