package com.vm.training.java.codingtest;
import java.security.DrbgParameters.NextBytes;
import java.util.*;

import com.vm.training.java.Exceptions.MinimumBalance;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String validate;
		String firstname="";
		String lastname="";
		Employee employee=new Employee(firstname,lastname);
		validate=employee.ValaidateMethod(firstname,lastname);
		
		
	}
}
