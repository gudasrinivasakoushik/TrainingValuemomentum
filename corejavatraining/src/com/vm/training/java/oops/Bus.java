package com.vm.training.java.oops;

public class Bus implements IVehical{

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("power steering");
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("hydralic brakes");
	}

	@Override
	public void accelarator() {
		// TODO Auto-generated method stub
		System.out.println("some what");
	}

	@Override
	public void clutches() {
		// TODO Auto-generated method stub
		System.out.println("based on gears");
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 6;
		
	}
	

}
