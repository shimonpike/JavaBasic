import java.util.ArrayList;

public class MainArrayListMethods {

	public static void main(String[] args)
	{
		ArrayList<String> list1 = 
				new ArrayList<>();
		list1.add("apple");
		list1.add("kiwi");
		list1.add("orange");
		list1.add("banana");
		list1.add("grape");
		list1.add("mango");
		list1.add(2, "lemon");
		list1.add("mango");
		
		System.out.println(list1);
		//list1.clear();
		boolean res = list1.contains("pineapple");
		System.out.println(res);
		int index = list1.indexOf("kiwi");
		System.out.println(index);
		list1.remove(1);
		System.out.println(list1);
		list1.remove("orange");
		System.out.println(list1);
		list1.set(2, "kiwi");
		System.out.println(list1);
		list1.sort(null);
		System.out.println(list1);
		ComparatorStringsReverse cmp = 
				new ComparatorStringsReverse();
		list1.sort(cmp);
		System.out.println(list1);
		list1.sort(null);
		System.out.println(list1);
		

	}
/*
 *    0      1     2      3       4       5      6
 * [apple, grape, kiwi, lemon, mango, mango]
 * [apple, lemon, kiwi, grape, mango, mango]
 * [apple, lemon, banana, grape, mango, mango]   
 * [apple, kiwi, lemon, orange, banana, grape, mango]
 * 
 * 
 */
}
