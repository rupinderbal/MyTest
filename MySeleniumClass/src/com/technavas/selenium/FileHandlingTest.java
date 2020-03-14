package com.technavas.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*try {
			File file = new File ("/Users/tarjindersingh/Downloads/abc.txt");
			Boolean status = file.createNewFile();
			if(status) {
			System.out.println("File created successfully");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*FileOutputStream out = new FileOutputStream("/Users/tarjindersingh/Downloads/test.txt");
		String str = "I am from India";
		byte b[] = str.getBytes();
		out.write(b);
		out.close();*/
		
		FileInputStream in = new FileInputStream("/Users/tarjindersingh/Downloads/test.txt");
		int i = 0;
		while((i = in.read())!=-1)
		{System.out.print((char)i);
	}
		in.close();
	}
	
}
