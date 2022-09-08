package PractiseDemo;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetPractise {

	public static void main(String[] args) {
		
	TreeSet TS = new TreeSet();
		
		TS.add(10);              //by default Output showing ascending order
		TS.add(15);
		TS.add(20);
		TS.add(25);
		TS.add(30);
		TS.add(10);
		TS.add(4);
		TS.add(3);
		TS.add(2);
		TS.add(1);
		
		Iterator itr = TS.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		TreeSet TST = new TreeSet();
		
		TST.add(10);              // Output showing DEscending order
		TST.add(15);
		TST.add(20);
		TST.add(25);
		TST.add(30);
		TST.add(10);
		TST.add(4);
		TST.add(3);
		TST.add(2);
		TST.add(1);

       Iterator it = TST.descendingIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
       TreeSet TS1 = new TreeSet();
		
		TS1.add("Anand");           // Output showing ascending
		TS1.add("Dileep");
		TS1.add("Chinnu");
		TS1.add("Mani");
		TS1.add("Balu");

		Iterator it1 = (Iterator) TS1.iterator();
		Iterator it2 = (Iterator) TS1.descendingIterator();
	//	Iterator it3 = (Iterator) TS1.first();
	//	Iterator it4 = (Iterator) TS1.last();
		
	while(it1.hasNext())
	{
		
	   System.out.println(it1.next());
	  
	}
	while(it2.hasNext())
	{
		
	   System.out.println(it2.next());
	  
	}
	}
}


