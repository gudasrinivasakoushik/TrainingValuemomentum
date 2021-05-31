package com.vm.training.java.Exceptions;

public class ClassNotFound {
public static void main(String[] args) {
try {
	Class.forName("javaVm");
	System.out.println("found class");
}
catch(ClassNotFoundException e)
{
	e.printStackTrace();
}
}
}
