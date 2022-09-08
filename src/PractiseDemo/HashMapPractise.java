package PractiseDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapPractise {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("SNo", 01);                         //Output showing Randomly
		hm.put("Name", "Dileep");
		hm.put("College", "Global Engg");
		hm.put("Address", "HYD");
		hm.put("Address", "HYD");
		
   //    hm.get("College");
   //    hm.remove("Address");
    //   hm.entrySet();
		
    Set s = hm.keySet();
    
    Iterator ite = s.iterator();
    
    while(ite.hasNext())
    {
     Object o = ite.next();
     String str =(String)o;
     System.out.println(str+":"+hm.get(str));
      
	}

}
}
