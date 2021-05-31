package com.vm.training.java.newFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
	static long countOfEmployee(ArrayList<Employee> emplist)
	{
		return emplist.stream().count();
	}
public static void main(String[] args) {
	ArrayList<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(1,"kou","cse",15000,20));
	employees.add(new Employee(2,"arini","hr",1000,20));
	employees.add(new Employee(3,"subha","ece",12000,20));
	employees.add(new Employee(4,"bash","mec",10000,20));
	employees.add(new Employee(5,"javed","hr",1000,20));
	employees.add(new Employee(4,"bash","mec",10000,20));
	
	employees.forEach(System.out::println);
	long employeecount=employees.stream().count();
	System.out.println("total employees"+employeecount);
	
	Employee developers;
	employees.stream().filter(s->s.getDept().equalsIgnoreCase("hr")).forEach(System.out::println);
	
	
	employees.stream().filter(s1->s1.getName().startsWith("a")).forEach(s->System.out.println(s));


	employees.stream().filter(s->s.getSalary()>5000).count();//forEach(s->System.out.println(s));
	System.out.println("salay"+employees);
	
	
	employees.stream().map(m->m.getSalary()*0.20+m.getSalary()+"  "+m.getName()+" "+m.getName().length()).forEach(System.out::println);

	
	employees.stream().sorted((s1,s2)->
	{
	if(s1.getSalary()==s2.getSalary())
		return 0;
	else if(s1.getSalary()>s2.getSalary())
		return 1;
	else
		return -1;
	
	}).forEach(System.out::println);
	
	
	List<Employee> empNameSort=employees.stream().sorted((o1,o2)->
	{
		return o1.getName().compareTo(o2.getName());
	}).collect(Collectors.toList());
	
	employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
	
	
	employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
	
	
	long sum=employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
	System.out.println("sum of total salries of emp:"+sum);
	
	
	List<Employee>uniqueemp=employees.stream().distinct().collect(Collectors.toList());
	System.out.println("unique employee lsit");
	
	
	uniqueemp.forEach(System.out::println);
	long sk=3;
	employees.stream().skip(sk).forEach(System.out::println);
	
	
	
	
}
}
