package week1;
import java.util.*;

public class Collectons {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String>city = new ArrayList<String>();
		city.add("Bangalore");
		city.add("vizag");
		System.out.println(city);
		
		//creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer>v=new Vector<Integer>();
		v.addElement(12);
		v.addElement(13);
		System.out.println(v);
		
		//creating linkedlist
		System.out.println("\n");
		System.out.println("linkedlist");
		LinkedList<String>names = new LinkedList<String>();
		names.add("Ram");
		names.add("laxman");
		Iterator<String>it =names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			//creating hashset
			System.out.println("\n");
			System.out.println("HashSet");
			HashSet<Integer>i =new HashSet<Integer>();
			i.add(112);
			i.add(113);
			i.add(114);
			i.add(123);
			System.out.println(i);
			
			//creating linkedHashSet
			System.out.println("\n");
		    System.out.println("LinkedHashSet");
		    LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
		    lhs.add(12);
		    lhs.add(13);
		    lhs.add(11);
		    lhs.add(14);
		    System.out.println(lhs);
		}
	}

}
