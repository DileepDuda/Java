package PractiseDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractise {

	public static void main(String[] args) {
		HashSet HS = new HashSet();
		
		HS.add(10);              //Output showing randomly
		HS.add(15);
		HS.add(20);
		HS.add(25);
		HS.add(30);
		HS.add(10);
		HS.add(4);
		HS.add(3);
		HS.add(2);
		HS.add(1);
		
		HS.add("Anand");
		HS.add("Dileep");
		HS.add("Chinnu");
		HS.add("Mani");
		HS.add("Balu");
		
		Iterator itr = HS.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
