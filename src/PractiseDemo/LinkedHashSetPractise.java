package PractiseDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractise {

	public static void main(String[] args) {
		
		LinkedHashSet LHS = new LinkedHashSet();
		
		LHS.add(10);              //Output showing insert order
		LHS.add(15);
		LHS.add(20);
		LHS.add(25);
		LHS.add(30);
		LHS.add(10);
		LHS.add(4);
		LHS.add(3);
		LHS.add(2);
		LHS.add(1);
		
		Iterator itr = LHS.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedHashSet LS = new LinkedHashSet();
		
		LS.add("Anand");
		LS.add("Dileep");
		LS.add("Chinnu");
		LS.add("Mani");
		LS.add("Balu");

		Iterator it = LS.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
