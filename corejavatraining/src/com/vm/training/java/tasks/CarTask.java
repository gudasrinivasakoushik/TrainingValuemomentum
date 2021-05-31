package com.vm.training.java.tasks;

public class CarTask {

	int yearModel;
	String make;
	int speed;
	public CarTask(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		this.speed=0;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int speed()
	{
		return speed=speed+5;
	}
	public int brake()
	{
		if(speed>=0)
		{
		return speed=speed-5;
		}
		else
		{
			return 0;
		}
	}
	
}
