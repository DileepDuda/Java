package PractiseDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractise01 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add("Dileep");       //Set interface can't allow duplicate values
		hs.add("Madhu");
		hs.add("Ramu");
		hs.add("Dileep");
		
		Iterator itr1 = hs.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
   
		LinkedHashSet LHS = new LinkedHashSet();
		
		LHS.add(3);
		LHS.add(6);
		LHS.add(9);
		LHS.add(12);
		LHS.add(15);
		LHS.add(18);
		LHS.add(6);
		
		Iterator it2 = LHS.iterator();
		
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
       LinkedHashSet LHS1 = new LinkedHashSet();
		
		LHS1.add(10);              //Output showing insert order
		LHS1.add(15);
		LHS1.add(20);
		LHS1.add(25);
		LHS1.add(30);
		LHS1.add(10);
		LHS1.add(4);
		LHS1.add(3);
		LHS1.add(2);
		LHS1.add(1);
		
		Iterator it3 = LHS1.iterator();
		
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}
		
		LinkedHashSet LS = new LinkedHashSet();
		
		LS.add("Anand");
		LS.add("Dileep");
		LS.add("Chinnu");
		LS.add("Mani");
		LS.add("Balu");

		Iterator it4 = LS.iterator();
		
		while(it4.hasNext())
		{
			System.out.println(it4.next());
		}
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

		Iterator it5 = (Iterator) TS1.iterator();
		Iterator it6 = (Iterator) TS1.descendingIterator();
	//	Iterator it3 = (Iterator) TS1.first();
	//	Iterator it4 = (Iterator) TS1.last();
		
	while(it5.hasNext())
	{
		
	   System.out.println(it5.next());
	  
	}
	while(it6.hasNext())
	{
		
	   System.out.println(it6.next());
	  
	}

	}
		
	}

