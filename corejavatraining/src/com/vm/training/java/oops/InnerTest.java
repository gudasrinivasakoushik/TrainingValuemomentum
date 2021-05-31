package com.vm.training.java.oops;

public class InnerTest {
public static void main(String[] args) {
	Outer outer=new Outer();
	Outer.Inner inner=outer.new Inner();
	inner.display();
	
}
}
