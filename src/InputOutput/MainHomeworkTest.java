package InputOutput;

public class MainHomeworkTest {

	public static void main(String[] args) {
		String[] ars = {"3","12","7","23","11"};
		int[] ari = {8,4,5,6,2,4};
		try {
		int res = getSum(ars, 1, ari, 2);
		System.out.println("res = " + res);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static int getSum(String[] ars, int i,
                                int[] ari,int j)
								throws NullPointerException,
								ArrayIndexOutOfBoundsException,
								NumberFormatException
	{
		if(ars == null || ari == null)
		{
		NullPointerException e = 
		new NullPointerException("Array reference is null");
			throw e;
		}
		if(i < 0 || j < 0 || i >= ars.length 
				                  || j >= ari.length)
		{
		   ArrayIndexOutOfBoundsException e = 
				new ArrayIndexOutOfBoundsException("Index out of bounds");
		  throw e;
		}
		int num1 = 0;
		//  12                     "12a"
		try {
		 num1 = Integer.parseInt(ars[i]);
		}
		catch(NumberFormatException e)
		{
			throw(e);
		}
		return num1 + ari[j];
	}
}
