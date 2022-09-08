package PractiseDemo;

import java.util.*;
import java.util.Map.Entry;


public class StringCount {


	public static void main(String[] args) {
		
		String s = "Dileep";
		char n[] = s.toCharArray();
		int size = n.length;
		
	
		
	HashMap<Character, Integer> LI = new HashMap<Character, Integer>();
		int i =0;
		
		while(i != size) {
			if(LI.containsKey(n[i])== false) {
				LI.put(n[i], 1);
				
			} else {
				
				int OV = LI.get(n[i]);
				int NV = OV + 1;
				LI.put(n[i], NV);
			}
			++i;
		}
		Set<Entry<Character, Integer>> hmap = LI.entrySet();
		
		for(Entry<Character, Integer> D : hmap) {
			if(D.getValue() > 1) {
				System.out.println(D.getValue());
				
			}
		}
		
		System.out.println("All are uniq");
		
	}

}