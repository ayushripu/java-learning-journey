package com.Demo;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        try {
     
            FileInputStream in = new FileInputStream("source.txt");
            FileOutputStream out = new FileOutputStream("destination.txt");
            int byteData;
            while ((byteData = in.read()) != -1)
            {
                out.write(byteData);
            }
            in.close();
            out.close();
            System.out.println("File copied successfully.");
        	}
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
