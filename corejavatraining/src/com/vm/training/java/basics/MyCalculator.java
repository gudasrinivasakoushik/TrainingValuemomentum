package com.vm.training.java.basics;

public class MyCalculator implements IAdvArithmatic {

	@Override
	public int divisor(int n) {
		// TODO Auto-generated method stub
		int sum=n,i;
		
		for( i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
