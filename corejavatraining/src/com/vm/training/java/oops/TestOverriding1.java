package com.vm.training.java.oops;

public class TestOverriding1 {
public static void main(String[] args) {
	son son=new Son(70,50,20);
	son.walk();
	GrandFather father =new Son(70,50,20);
	father.walk();
}
}
