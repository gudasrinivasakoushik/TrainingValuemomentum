package com.vm.training.java.oops;

public class Calculator {
	int n1,n2,n3,n4;
	double s=0;
	double f;
	long l;
/*
	public Calculator(int n1, int n2, int n3, int n4, int s) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.s = s;
	}*/

	 void add(int n1,int n2) {
		l=n1+n2;
		
	}
	double add(int n1,double f) {
		s=n1+f;
		return s;
	}
	
	long add(int n1,int n2,int n3) {
		s=n1+n2+n3;
		return 1;
	}
	long add(int n1,int n2,int n3,int n4) {
		s=n1+n2+n3+n4;
		return 1;
	}
	
	
	
	

}
