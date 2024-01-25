package com.helpers;

import java.io.IOException;

public class File_Reader_Manager {
	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}

	public static File_Reader_Manager getInstance() {
		// TODO Auto-generated method stub
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;
	}

	public static Configuration_Reader getInstanceCR() throws IOException {
		// TODO Auto-generated method stub
		Configuration_Reader config = new Configuration_Reader();
		return config;
	}
}
