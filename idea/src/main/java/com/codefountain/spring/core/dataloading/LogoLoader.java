package com.codefountain.spring.core.dataloading;

import jdk.internal.loader.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

@Component
public class LogoLoader {

    private FileSystemResource logo = new FileSystemResource("C:/Users/musib/Desktop/logo.txt");

    public void loadLogo() throws IOException {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(logo.getInputStream()))) {
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
    }

}
