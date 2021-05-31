package com.vm.training.java.Exceptions;
import java.util.*;
public class MinimumBalance extends Exception {
Scanner sc=new Scanner(System.in);
String balance;
String mblance;

public MinimumBalance(String mblance) {
	super();
	this.mblance = mblance;
}

@Override
public String toString() {
	return "MinimumBalance [mblance=" + mblance + "]";
}



}
