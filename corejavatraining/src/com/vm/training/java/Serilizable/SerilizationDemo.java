package com.vm.training.java.Serilizable;
import java.io.*;
public class SerilizationDemo {
public static void main(String[] args) throws IOException {
	
	Employee em=new Employee(1,"jhon");
	 FileOutputStream fis=new FileOutputStream("abc.ser");
	 ObjectOutputStream oos=new ObjectOutputStream(fis);
	 oos.writeObject(em);
	 System.out.println("===serliazation done===");
	
}
}
