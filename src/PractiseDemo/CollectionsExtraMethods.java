package PractiseDemo;

import java.util.*;


public class CollectionsExtraMethods {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList AL = new ArrayList();
		
		AL.add(10);
		AL.add(20);
		AL.add(5);
		AL.add(30);
		AL.add(15);
		
		System.out.println(AL);
		
		Collections.sort(AL);
		
		System.out.println(AL);
		
		Collections.reverse(AL);
		
		System.out.println(AL);
		
		
		System.out.println(Collections.min(AL));
		
		
		System.out.println(Collections.max(AL));
		
	}

}
