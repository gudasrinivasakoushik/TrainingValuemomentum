package com.vm.training.java.oops;

public class EmployeeDetails extends Employee {
	String emailid;
	String mobile;
	String address;
	
	public EmployeeDetails(int Empid,String Ename,String Dept,String emailid, String mobile, String address) {
		super(Empid,Ename,Dept);
		this.emailid = emailid;
		this.mobile = mobile;
		this.address = address;
	}
	public String toString() {
		return Empid+" "+Ename+" "+Dept+" "+emailid+" "+mobile+" "+address;
		
	}
	public static void main(String[] args) {
		EmployeeDetails empDetails=new EmployeeDetails(100,"a","b","c@.com","98","a2b");
		System.out.println(empDetails);
	}

}
