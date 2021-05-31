package com.vm.training.java.Exceptions;
import java.io.*;
public class TryWithResourcesTest {
public static void main(String[] args) {
	try(FileOutputStream fos=new FileOutputStream(new File("D:/kou.txt"))){
		String s="Trainee";
		byte[] by=s.getBytes();
		fos.write(by);
		System.out.println("sucess");
		
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException e1) {
		e1.printStackTrace();
	}
}
}
