package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFilePractice {

	public static void main(String[] args) throws IOException {
		String path = "data\\practice.properties";
		Properties prop = new Properties();
		File f= new File(path);
		FileInputStream fi = new FileInputStream(f);
		prop.load(fi);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("title"));
		System.out.println(prop.getProperty("department"));
		
		
	}

}
