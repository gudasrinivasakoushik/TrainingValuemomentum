package com.vm.training.java.io;
import java.io.*;
public class FilereaderDemo {
public static void main(String[] args) throws IOException {
	File f=new File("sachin.txt");
	FileReader fr=new FileReader(f);
	
	
	int readChar=fr.read();
	while(readChar!=-1)
	{
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println((char)readChar);
		readChar=fr.read();
	}

}
}
