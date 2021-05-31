package com.vm.training.java.Exceptions;

public class ProductDamaged  extends Exception{
	String pdam;
	ProductDamaged(String pdam)
	{
		this.pdam=pdam;
	}
	@Override
	public String toString() {
		return "ProductDamaged [pdam=" + pdam + "]";
	}


}
