package Maps;

import java.util.*;

public class MainMapTest {

	public static void main(String[] args) {
		HashMap<String,Integer> map1 = 
				new HashMap<String,Integer>();
		map1.put("Haim", 26);
		map1.put("Alon", 15);
		map1.put("Dan", 45);
		map1.put("Viki", 36);
		map1.put("Tolya", 70);
		System.out.println(map1);
		
		LinkedHashMap<String,Integer> map2 = 
				new LinkedHashMap<String,Integer>();
		map2.put("Haim", 26);
		map2.put("Alon", 15);
		map2.put("Dan", 45);
		map2.put("Viki", 36);
		map2.put("Tolya", 70);
		System.out.println(map2);
		
		TreeMap<String,Integer> map3 = 
				new TreeMap<String,Integer>();
		map3.put("Haim", 26);
		map3.put("Alon", 15);
		map3.put("Dan", 45);
		map3.put("Viki", 36);
		map3.put("Tolya", 70);
		System.out.println(map3);
		

	}

}
/*
     Map                  Set
   key | value           ----
                           key        value
   -----------            ["Haim"]--->26
                          ["Hanna"]--->15
                          ["Eli"]----->45
                          ["Alon"]---->45
     


*/