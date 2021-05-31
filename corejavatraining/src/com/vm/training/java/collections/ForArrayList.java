package com.vm.training.java.collections;
import java.util.*;
public class ForArrayList {
public static void main(String[] args) {
	 

ArrayList al=new ArrayList<>();
	al.add("fiction");
	al.add("comedy");
	al.add("love");
	al.add("sci-fic");
	al.add("vijay");
ArrayList arl=new ArrayList<>();
	arl.add("s rao");
	arl.add("kedny");
	arl.add("robert"");
	ArrayList<ArrayList > arrl = 
            new ArrayList<ArrayList>();
	System.out.println(arrl);
	arrl.add(al);
	arrl.add(arl);
	System.out.println(arrl);

	
}
}
