package Comparator;

import java.util.ArrayList;

public class MainJCFtest {

	public static void main(String[] args)
	{
		ArrayList<Object> list = 
				   new ArrayList<Object>();
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(6.7);
		list.add("Hello");
		list.add(true);
		System.out.println(list);
		for(Object o : list)
		{
			System.out.print(o + " ");
		}
		System.out.println();
		
		
		ArrayList<String> list1 = 
				new ArrayList<>();
		list1.add("apple");
		list1.add("kiwi");
		list1.add("orange");
		list1.add("banana");
		list1.add("grape");
		list1.add("mango");
		list1.add(2, "lemon");
		int size = list1.size();
		System.out.println("list size = " + size);
		//list1.add(8, "pineapple");
			
		System.out.println(list1);
		
		for(int i = 0;i < list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("===================");
		for(String s : list1)
		{
			System.out.println(s);
		}
	}

}
/*          
 * list1->
 *                                              i++
 *    0      1     2       3       4      5      6
 * [apple, kiwi, orange, banana, grape, mango]
 * [apple, kiwi, lemon, orange, banana, grape, mango]
      s
 * 
 *              0  1  2  3  4  5  6  7 
 *    ArrayList[7, 8, 9, 4, 1, 4, 5, 7]
 * 
 * 
 */
