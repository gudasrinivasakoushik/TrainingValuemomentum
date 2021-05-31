package com.vm.training.java.collections;

public class Wrestler {
private String Name;
private double weight;
private double height;
public Wrestler(String name, double weight, double height) {
	super();
	Name = name;
	this.weight = weight;
	this.height = height;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
@Override
public String toString() {
	return "Wrestler [Name=" + Name + ", weight=" + weight + ", height=" + height + "]";
}



}
