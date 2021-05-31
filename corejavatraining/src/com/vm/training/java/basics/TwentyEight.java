package com.vm.training.java.basics;

public class TwentyEight {
public static void main(String[] args) {
	   int[] ar = {21, 92, 8, 20, 42, 53};
	   try {
		   System.out.println(ar[7]);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Array out of bound exception");
	   }
}
}
