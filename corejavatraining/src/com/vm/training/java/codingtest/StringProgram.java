package com.vm.training.java.codingtest;
import java.util.*;
public class StringProgram {
	static int wordcount(String string)  
    {  
      int count=0;  
  
        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s="hello welocme to india";
	
	StringBuffer sb=new StringBuffer(s);
	
	int count=0;
	for(int i = 0; i < s.length(); i++) {    
        if(s.charAt(i) != ' ')    
            count++;    
    }  
	System.out.println("charaer:"+count);
	System.out.println("word:"+wordcount(s));
	
}
}
