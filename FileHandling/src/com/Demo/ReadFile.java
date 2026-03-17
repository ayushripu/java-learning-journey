package com.Demo;

import java.io.*;
import java.nio.Buffer;

public class ReadFile {

	public static void main(String[] args) {
	try {
		BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\asus\\OneDrive\\Desktop\\lc.txt"));
		
		bf.write("Ayush");
		bf.newLine();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

	}

}
