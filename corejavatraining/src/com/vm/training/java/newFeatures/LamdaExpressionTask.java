package com.vm.training.java.newFeatures;
import java.util.*;
interface Lengthfind
{
	void findlength(String s);
}
interface Reversefind
{
	void findreverse(String s);
}
public class LamdaExpressionTask {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//String s=sc.next();
		StringBuffer sb=new StringBuffer("kouhik");
		Lengthfind lf=(s) ->
		{
			System.out.println(sb.length());
		};
		lf.findlength("koushik");
		Reversefind rf=(s) ->
		{
			
			System.out.println(sb.reverse().toString());
		};
		rf.findreverse("koushik");
		
	}
}
