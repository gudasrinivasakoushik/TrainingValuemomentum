package com.vm.training.java.strings;
import java.util.*;
public class StringObjectCreation {
public static void main(String[] args) {
	//Scanner sc=new Scanner (System.in);
	//String s1=new String("VM");
	String s2="    value     momentum";
	//String s3=sc.nextLine();
	//String s4=sc.next();
	//System.out.println(s1==s2);
	//System.out.println(s1.equals(s2));
	//System.out.println(s1.toUpperCase());
	//System.out.println(s1.charAt(1));
	//System.out.println(s1.length());
	//System.out.println(s1.replace("V","M"));
	//System.out.println(s2.trim());
	//System.out.println(s2.replaceAll(" ", ""));
	StringBuilder sb=new StringBuilder("kyc");
	sb.append("abc");
	System.out.println(sb);
	StringBuffer sbf=new StringBuffer("koushik");
	sbf.append("guda");
	System.out.println(sbf);
	System.out.println(s2.indexOf('m'));
	System.out.println(sb.indexOf('y',4));
}
}
