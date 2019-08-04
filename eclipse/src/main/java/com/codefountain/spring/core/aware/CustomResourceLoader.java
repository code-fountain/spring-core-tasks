package com.codefountain.spring.core.aware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomResourceLoader implements ResourceLoaderAware {

	private ResourceLoader resourceLoader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	public void doLoad() throws IOException {
		String line = null;
		Resource resource = resourceLoader.getResource("file:C:/Users/musib/Desktop/logo.txt");
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))){
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

}
