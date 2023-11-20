package Maps;

import java.util.*;

public class MainMapMethods {

	public static void main(String[] args)
	{
		LinkedHashMap<String,Integer> map2 = 
				new LinkedHashMap<String,Integer>();
		map2.put("Haim", 26);
		map2.put("Alon", 15);
		map2.put("Dan", 45);
		map2.put("Viki", 36);
		map2.put("Tolya", 70);
		System.out.println(map2);
		boolean res = map2.containsKey("Alon");
		System.out.println(res);
		res = map2.containsValue(15);
		System.out.println(res);
		int value = map2.get("Dan");
		System.out.println(value);
		map2.remove("Igor");
		System.out.println(map2);
		map2.remove("Tolya", 71);
		System.out.println(map2);
		map2.replace("Tolya", 71);
		System.out.println(map2);
		map2.replace("Tolya", 70, 72);
		System.out.println(map2);
		map2.put("Viki", 23);
		System.out.println(map2);
		
		printMap(map2);
	}

	private static void 
	printMap(Map<String, Integer> map)
	{
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			System.out.println(key + " : " + map.get(key));
		}
	}

}
/*
    key | value
    -----------
    Haim  26
    Alon  15
    Dan   45    ====> [Haim,Alon,Dan,Viki,Tolya]
    Viki  36                     key  
    Tolya 70
    
      
      


*/ 