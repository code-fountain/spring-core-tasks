package com.codefountain.spring.core.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomResourceLoader implements ResourceLoaderAware {

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Resource logo = resourceLoader.getResource("file:C:/Users/musib/Desktop/logo.txt");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(logo.getInputStream()))){
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException ioe){
            throw new RuntimeException(ioe.getMessage());
        }
    }
}
