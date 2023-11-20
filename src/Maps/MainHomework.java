package Maps;

import java.util.*;

public class MainHomework {

	public static void main(String[] args)
	{
		String s = "go dog deliver a dare vile another dog";
		printWordsInABCOrder(s);
		String st = "performance";
		printCharInReverseABCOrder(st);
		
	}
	private static void printCharInReverseABCOrder(String s)
	{
		ComparatorCharsReverse cmp = 
				new ComparatorCharsReverse();
		TreeSet<Character> set = 
						new TreeSet<>(cmp);
		for(int i = 0;i < s.length();i++)
		{
			char sym = s.charAt(i);
			set.add(sym);
		}
		for(char c : set)
		{
			System.out.println(c);
		}
	}
	public static void printWordsInABCOrder(String s)
	{
		TreeSet<String> set = new TreeSet<>();
		String[] ar = s.split(" ");
		for(String str : ar)
		{
			set.add(str);
		}
		for(String str : set)
		{
			System.out.println(str);
		}
	}
}
