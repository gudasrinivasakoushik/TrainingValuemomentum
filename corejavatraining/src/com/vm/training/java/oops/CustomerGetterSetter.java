package com.vm.training.java.oops;

public class CustomerGetterSetter {
public static void main(String[] args) {
	Customer customer=new Customer();
	customer.setId(1001);
	customer.setFirstName("guda");
	customer.setLastName("koushik");
	customer.setAccount("savings");
	System.out.println(customer.getId());
	System.out.println(customer.getFirstName());
	System.out.println(customer.getLastName());
	System.out.println(customer.getAccount());
}
}
