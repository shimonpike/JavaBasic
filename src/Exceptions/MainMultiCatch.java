import java.util.ArrayList;

public class MainMultiCatch {

	public static void main(String[] args)
	{   
		int a = 6, b = 0, c = 0,index = 5,index1 = 4;
		String s = null, s1 = "hello", s2 = "23a";
		int[] ar = {5,3,1};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
while(true)
{
	try {
		c = a / b;
		System.out.println("c = " + c);
	
		int len = s.length();
		System.out.println("len = " + len);
		
		char sym = s1.charAt(index);
		System.out.println("sym: " + sym);
		
		int res = ar[index1];
		System.out.println("res = " + res);
		
		a = Integer.parseInt(s2);
		System.out.println("a x 2 = " + a*2);
		
		b = list.get(index1);
		System.out.println("b = " + b);
		break;
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException");
		b = 1;
	}
	catch(NullPointerException e)
	{
		System.out.println("NullPointerException");
		s = "default";
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("StringIndexOutOfBoundsException");
		index = 0;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException");
		index1 = 0;
	}
	catch(NumberFormatException e)
	{
		System.out.println("NumberFormatException");
		//throw(e);
		s2 = "1";
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println("IndexOutOfBoundsException");
		index1 = 0;
	}
	catch(Exception e)
	{
		System.out.println("Exception");
	}
}
		
		System.out.println("END");
	}

}
