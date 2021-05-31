package com.vm.training.java.oops;

public class TestInterface {
public static void main(String[] args) {
	IVehical vehical=new Bus();
	//Bus bus=new Bus();
	//Car car=new Car();
	vehical.steering();
	vehical.accelarator();
	vehical.brakes();
	vehical.clutches();
	vehical.gears();
	vehical.ac();
	vehical.indicators();
	
	Car car=new TATA("car");
	car.steering();
	car.accelarator();
	car.brakes();
	car.clutches();
	car.gears();
	car.ac();
	car.indicators();
}
}
