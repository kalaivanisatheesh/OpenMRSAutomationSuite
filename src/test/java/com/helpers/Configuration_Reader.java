package com.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	Properties p;

	public Configuration_Reader() throws IOException {
		// TODO Auto-generated constructor stub
		File f = new File("D:\\Eclipse\\Eclipse Workspace\\openmrs\\src\\test\\java\\com\\helpers\\data.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getUrl() {
		// TODO Auto-generated method stub
		String url = p.getProperty("url");
		return url;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		String a = p.getProperty("username");
		return a;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		String c = p.getProperty("password");
		return c;
	}
}
