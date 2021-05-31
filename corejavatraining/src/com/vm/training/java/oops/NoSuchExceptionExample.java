package com.vm.training.java.oops;
import java.util.*;
class Element{
	void cd(){
		System.out.println("id");
	}
}

public class NoSuchExceptionExample {
public static void main(String[] args) {
    Element d=new Element();
    System.out.println(d.c());//NoSuchMethodException


}
}
