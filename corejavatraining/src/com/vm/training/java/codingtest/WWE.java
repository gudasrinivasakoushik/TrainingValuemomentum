package com.vm.training.java.codingtest;
import java.util.*;
public class WWE {
	private String firstname;
	private String lastname;
	private int weight;
	public WWE(String firstname, String lastname, int weight) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.weight = weight;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "WWE [firstname=" + firstname + ", lastname=" + lastname + ", weight=" + weight + "]";
	}
	
	
}
