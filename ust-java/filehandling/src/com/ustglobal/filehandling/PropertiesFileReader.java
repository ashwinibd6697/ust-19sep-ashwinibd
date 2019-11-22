package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {


//		String path="text.properties";
		String path="db.properties";
		FileReader reader=null;
		
		
		try {
			reader=new FileReader(path);
            Properties p =new Properties();
            p.load(reader);
            String name=p.getProperty("url");
            String company=p.getProperty("user");
            String best=p.getProperty("password");
            System.out.println("url    : "+name);
            System.out.println("user : "+company);
            System.out.println("password  : "+best);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
