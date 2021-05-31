package com.vm.training.java.Serilizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class DeSerilixationDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis=new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Employee e=(Employee) ois.readObject();
	System.out.println(e.id+ " "+e.name);
	
}
}
