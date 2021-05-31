package com.vm.training.java.oops;
import java.util.*;
public class NoSuchElementException {
	public static void main(String[] args) {
		Set shm = new HashSet();  
	    Hashtable hm = new Hashtable();  //NoSuchElementException

	    shm.iterator().next();   
	}

}
