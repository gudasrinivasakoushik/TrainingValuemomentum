package com.vm.training.java.oops;

public class EmployeeGetterSetter {
public static void main(String[] args) {
	Employee employee=new Employee();
	Employee.setEmpid(1001);
	Employee.setEname("guda");
	Employee.setDept("koushik");
	
	System.out.println(employee.getEmpid());
	System.out.println(employee.getEname());
	System.out.println(employee.getDept());
	
}
}
