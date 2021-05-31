package com.vm.training.java.io;
import java.io.*;
public class CreaeDemo {
public static void main(String[] args) throws IOException {
	File f=new File("sachin.txt");
	File f2=new File("C:\\Users\\DELL\\Documents\\zoom link");
	if(f.exists())
	{
		System.out.println("file already exists");
	}
	else
	{
		System.out.println("file is not present we are creaing");
		f.createNewFile();
		System.out.println("file created");
	}
}
}
