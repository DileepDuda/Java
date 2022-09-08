package PractiseDemo;

import java.util.*;


public class TreeMapPractise {

	public static void main(String[] args) {
		
	TreeMap lhm1 = new TreeMap();
		
		lhm1.put("SNo", 15);                // Output showing Ascending order 
		lhm1.put("Name", "Rajitha");
		lhm1.put("College", "Global Engg");
		lhm1.put("Address", "HYD");

		Set A = lhm1.keySet();
		
		Iterator ITER = A.iterator();
		
		while(ITER.hasNext())
		{
			Object O=ITER.next();
			String str = (String)O;
			System.out.println(str+" "+lhm1.get(str));
		}
		
	}

}
