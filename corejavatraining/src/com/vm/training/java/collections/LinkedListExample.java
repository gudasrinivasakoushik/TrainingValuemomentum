package com.vm.training.java.collections;
import java.util.*;
public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<String> arrl = new LinkedList<String>();
   
    arrl.add("basha");
    arrl.add("subha");
    arrl.add("javed");
    Iterator<String> itr = arrl.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    LinkedList<String> c = (LinkedList<String>) arrl.clone();
    System.out.println(c);
    LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
    lhm.put("k","g");
    lhm.put("l","m");
    System.out.println("Contains key 'two'? "+lhm.containsKey("two"));
    System.out.println(lhm);
    Set<String> ke = lhm.keySet();
    for(String k:ke){
        System.out.println(k+" -- "+lhm.get(k));
    }
    ArrayList<>
}
}
