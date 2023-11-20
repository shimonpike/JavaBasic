import java.util.*;

public class MainHomework {

	public static void main(String[] args)
	{//                i++
		//          0123456789 
		String s = "ccababacca";
		printCharOrder(s);

	}
	public static void printCharOrder(String s)
	{
		TreeMap<Character,Integer> map = 
							new TreeMap<>();
		for(int i = 0;i < s.length();i++)
		{
			char sym = s.charAt(i);
			boolean isExists = map.containsKey(sym);
			if(isExists == false)
			{
				map.put(sym, 1);
			}
			else {
				int value = map.get(sym);
				value++;
				map.replace(sym, value);
			}
		}
		//////////////////////////////////////
		Set<Character> keys = map.keySet();
		Object[] ar = keys.toArray();
		for(int i = ar.length-1;i >= 0;i--)
		{
			System.out.println(ar[i] + " : " 
		                      + map.get(ar[i]));
		}
		/*
		for(char ch : keys)
		{
			System.out.println(ch +" : "
		                        + map.get(ch));
		}*/
	}

}
