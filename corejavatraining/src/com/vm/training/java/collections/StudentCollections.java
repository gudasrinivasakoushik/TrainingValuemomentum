package com.vm.training.java.collections;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;

class Student{
		int id;
		String name;
		String branch;
	public	Student(int id,String name,String branch){
		this.id=id;
		this.name=name;
		this.branch=branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
}
public class StudentCollections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>(); 
		Student  s1 =  new Student(1550,"kumar","It");
		Student s2 =  new Student(1556,"santosh","It");
		al.add(s1);
		al.add(s2);
		System.out.println(al);
	   //al.(1, "Introductoin to Algorithms");
	}

}