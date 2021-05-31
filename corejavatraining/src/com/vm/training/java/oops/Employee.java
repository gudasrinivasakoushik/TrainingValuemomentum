package com.vm.training.java.oops;

public class Employee {
	protected static int Empid;
	private static String Ename;
	private static String Dept;
	protected int getEmpid() {
		return Empid;
	}
	public static  void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEname() {
		return Ename;
	}
	public static void setEname(String ename) {
		Ename = ename;
	}
	public String getDept() {
		return Dept;
	}
	public static void setDept(String dept) {
		Dept = dept;
	}

	
	
}



