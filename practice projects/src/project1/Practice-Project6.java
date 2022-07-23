package project1;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		//HashMap
		HashMap<Integer,String>hm= new HashMap<Integer,String>();
		hm.put(1,"sam");
		hm.put(2,"dean");
		hm.put(3,"cass");
		System.out.println("Hashmap elements are");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//HashTable
		Hashtable<Integer,String>ht= new Hashtable<Integer,String>();
		ht.put(4,"raj");
		ht.put(5,"ajay");
		ht.put(6,"varun");
		System.out.println("\nHashtable elements are");
		for(Map.Entry n:ht.entrySet()) {
			System.out.println(n.getKey()+" "+n.getValue());
		}
		
		//TreeMap
		TreeMap<Integer,String>tm= new TreeMap<Integer,String>();
		tm.put(7,"vasu");
		tm.put(8,"karan");
		tm.put(9,"arun");
		System.out.println("\nHashtable elements are");
		for(Map.Entry o:tm.entrySet()) {
			System.out.println(o.getKey()+" "+o.getValue());
	}

}
}
