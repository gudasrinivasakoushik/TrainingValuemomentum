package com.vm.training.java.io;
import java.util.*;
import java.io.*;
public class TaskFile2 {
public static void main(String[] args) {
	try
	{
		
		File f=new File("C:\\Users\\DELL\\Desktop\\ForFiles\\numbers.txt");
		if(f.exists())
			f.createNewFile();
		String s="";
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			s=s+sc.nextLine();
		}
		String[] str=s.split(",");
		for(int i=0;i<str.length;i++)
		{
			if(Integer.parseInt(str[i])%2==0)
			{
				System.out.println(str[i]+" ");
			}
		}
		sc.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
