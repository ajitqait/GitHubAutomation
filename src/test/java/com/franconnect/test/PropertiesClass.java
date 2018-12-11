package com.franconnect.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class PropertiesClass {
	public static void main(String[] args) throws IOException {
		FileInputStream inStream=new FileInputStream(new File("./config.properties"));
		Properties p=new Properties();
		p.load(inStream);
		System.out.println(p.getProperty("tier"));
	}
}
