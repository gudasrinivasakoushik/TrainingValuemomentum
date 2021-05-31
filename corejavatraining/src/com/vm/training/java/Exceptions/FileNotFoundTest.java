package com.vm.training.java.Exceptions;
import java.io.*;
public class FileNotFoundTest {
public static void main(String[] args) {
	File file=new File();
	try {
	FileInputStream fis=new FileInputStream(file);
	while(fis.read()!=-1)
	{
		System.out.println(fis.read());
	}
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	finally {
		fis.close();}
}
		catch(IOException e) {
			e.printStackTrace();
		}
		}

	
}
}
