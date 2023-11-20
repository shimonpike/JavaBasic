package Exceptions;

import java.util.*;

public class MainExceptionTest {

	public static void main(String[] args)
	{   
		int a = 6, b = 0, c = 0,index = 5,index1 = 4;
		String s = null, s1 = "hello", s2 = "23a";
		int[] ar = {5,3,1};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		try {
		c = a / b;
		System.out.println("c = " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		try {
		int len = s.length();
		System.out.println("len = " + len);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		try {
		char sym = s1.charAt(index);
		System.out.println("sym: " + sym);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		try {
		int res = ar[index1];
		System.out.println("res = " + res);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		try {
		a = Integer.parseInt(s2);
		System.out.println("a x 2 = " + a*2);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		try {
		b = list.get(index1);
		System.out.println("b = " + b);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println("END");
	}

}





