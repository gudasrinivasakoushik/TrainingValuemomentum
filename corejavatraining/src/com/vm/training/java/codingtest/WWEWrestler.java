package com.vm.training.java.codingtest;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class WWEWrestler {
	private static List<String> printFirstName(List <WWE> list)
	{
		 return list.stream().map(p->p.getFirstname()).collect(Collectors.toList());
		
	}
	public static List<WWE> sortbyname(List<WWE> list )
	{
		return list.stream().sorted(Comparator.comparing(WWE::getFirstname)).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		List<WWE> wrestler=new ArrayList<WWE>();
		wrestler.add(new WWE("guda","koushik",210));
		wrestler.add(new WWE("tirumala","subha",236));
		wrestler.add(new WWE("basha","chand",196));
		wrestler.add(new WWE("javeed","akthar",315));
		wrestler.add(new WWE("kedari","teja",292));
		wrestler.add(new WWE("kin","kia",152));
		
		long nowrestlers = wrestler.stream().count();
		System.out.println("No of wrestlers :"+nowrestlers);
		
		
		long  totalweight = wrestler.stream().filter(p->p.getWeight()>200).map(p->p.getWeight()).reduce(0,(A,B)->A+B);
		 System.out.println("sum of wrestlers weight > 200 : "+totalweight);
		 
		 
		 System.out.println("FirstName of all wrestlers are: ");
		 printFirstName(wrestler).forEach(p->System.out.println(p));
		
		 System.out.println("after sorting;");
		sortbyname(wrestler).forEach(p->System.out.println(p));
	}
}
