package com.vm.training.java.io;
import java.io.*;
public class FileWriterDemo {
public static void main(String[] args) throws IOException {
	
	//File f=new File("sachin.txt");
	//FileWriter fw=new FileWriter(f);
	FileWriter fw=new FileWriter(new File("sachin1.txt"));
	fw.write("kou");
	fw.write("hello");
	fw.write(98);
	fw.close();
	System.out.println("data entered");
}
}
