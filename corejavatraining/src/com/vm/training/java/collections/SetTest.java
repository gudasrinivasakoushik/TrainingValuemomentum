package com.vm.training.java.collections;
import java.util.*;
class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
class EmployeeDetails extends Employee{
	String address;

	public EmployeeDetails(int id, String name, String address) {
		super(id, name);
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [address=" + address + "]";
	}
	
	
}
public class SetTest {
public static void main(String[] args) {
	Hashtable<Employee,EmployeeDetails> hashSet=new Hashtable<Employee,EmployeeDetails>();
	HashSet<Employee> hashset=new HashSet();
	ArrayList<Employee> arrayList=new ArrayList<>();
	arrayList.add(new Employee(10,"kou"));
	System.out.println(arrayList);
	ArrayList<EmployeeDetails> arrayList1=new ArrayList<>();
	arrayList1.add(new EmployeeDetails(0, "ongole", null));
	System.out.println(arrayList1);
}
}
