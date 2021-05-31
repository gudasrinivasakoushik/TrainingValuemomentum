package com.vm.training.java.io;
import java.util.*;
import java.io.*;
public class FileTask {
public static void main(String[] args) throws Exception {
	
	
	FileReader fr=new FileReader("FileTask.txt");
	BufferedReader br = new BufferedReader(fr);  
    br.readLine();  
    br.close();  
    System.out.println("Success");  
	/*int i;
	while((i=fr.read())!=-1)
	{
		System.out.println((char)i);
		
	}
	fr.close();
	
	*/
}
}
