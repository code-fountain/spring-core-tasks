package com.codefountain.spring.core.javaconfig.collection;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductViewer {

    @Autowired
    private Map<String, Product> products;

    public void viewProducts(){
        for(Map.Entry<String, Product> product : products.entrySet()){
            System.out.println(product.getKey() +"===> "+product.getValue());
        }
    }
}
