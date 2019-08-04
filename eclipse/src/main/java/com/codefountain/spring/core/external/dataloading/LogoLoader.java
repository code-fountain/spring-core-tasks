package com.codefountain.spring.core.external.dataloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class LogoLoader {

	//@Value("${classpath:logo.txt}")
	//@Value("${file:C:/Users/musib/Desktop/logo.txt}")
	private Resource resource = new FileSystemResource("C:/Users/musib/Desktop/logo.txt");
	
	public void loadLogo() throws IOException {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))){
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
}
