import java.util.*;
import java.io.*;
import java.lang.System;

class Demo {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("Friends.properties");
		p.load(fis);
		String str = p.getProperty("Sachin");
		System.out.println(str);
		p.setProperty("Mukesh","TCS");
		System.out.println(str);
		FileOutputStream fos = new FileOutputStream("Friends.properties");
		p.store(fos,"Updated by me");
	}
} 
