package com.vm.training.java.basics;

public class MobileSecond {
String owner;
String model;
String memory;
public MobileSecond(String owner, String model, String memory) {
	super();
	this.owner = owner;
	this.model = model;
	this.memory = memory;
}
@Override
public String toString() {
	return "MobileSecond [owner=" + owner + ", model=" + model + ", memory=" + memory + "]";
}
void message()
{
	System.out.println("send message");
}
}
