package com.codefountain.spring.core.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemApplicationContextMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new 
				FileSystemXmlApplicationContext("file:///C:/Somnath/Courses/files/applicationContext-album.xml",
						"file:///C:/Somnath/Courses/files/applicationContext-song.xml");
		System.out.println(applicationContext.getBean(Album.class));
		System.out.println(applicationContext.getBean(Song.class));
		
	}
}
