package Maps;

import java.util.*;

public class MainInterviewTest {

	public static void main(String[] args)
	{
		ArrayList<Character> list = new ArrayList<>();
		list.add('c');
		list.add('b');
		list.add('a');
		list.add('c');
		list.add('b');
		list.add('a');
		list.add('c');
		list.add('c');
		list.add('b');
		printCharCount(list);
		

	}
    public static void printCharCount(ArrayList<Character> list)
    {
    	TreeMap<Character,Integer> map = new TreeMap<>();
    	for(char x : list)
    	{
    		boolean res = map.containsKey(x);
    		if(res == false)
    		{
    			map.put(x, 1);
    		}
    		else {
    			int value = map.get(x);
    			value++;
    			map.replace(x, value);
    		}
    	}
    	// TreeMap created
    	///////////////////////////////////////////////////
    	Set<Character> keys = map.keySet();
    	for(char sym : keys)
    	{
    		System.out.println(sym +"="+map.get(sym));
    	}
    }
}
/*             x  
       list ->[c,b,a,c,b,a,c,c,b] TreeSet=> [a,b,c]
       
       TreeMap
       key | value
       -----------
       a      2
       b      3  ======> keys ->[a, b, c]
       c      4                 sym   
       
       
       output:
       a=2
       b=3
       c=4
       
       
       
*/