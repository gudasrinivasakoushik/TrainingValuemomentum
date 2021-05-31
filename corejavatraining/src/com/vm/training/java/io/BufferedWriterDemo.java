package com.vm.training.java.io;
import java.io.*;
public class BufferedWriterDemo {
public static void main(String[] args) throws IOException {

	FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\ForFiles.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("hello");
	bw.newLine();
	bw.write("java");
	bw.newLine();
	bw.write("thanks");
	
	bw.flush();
	bw.close();
	
}
}
