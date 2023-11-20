
public class MainMethodsTest {

	public static void main(String[] args)
	{
		String s = "Go deliver a dare vile dog";
		boolean res = palindrome(s);
		if(res == true)
			System.out.println("palindrome");
		else
			System.out.println("not");
		printInReverseOrder(s);

	}
	public static void printInReverseOrder(String s)
	{
		String[] ar = s.split(" ");
		for(int i = ar.length-1;i >= 0;i--)
		{
			System.out.println(ar[i]);
		}
	}
	/*
	 * 
	 * s->"Go deliver a dare vile dog"
	 * s.split(" ")
	 *                                 --i
	 *      0     1     2   3      4    5 
	 * ar->[Go][deliver][a][dare][vile][dog]
	 * 
	 * 
	 * 
	 * dog
	 * vile
	 * dare
	 * a
	 * deliver
	 * Go
	 * 
	 * 
	 * 
	 */
	public static boolean palindrome(String s)
	{
		s = s.toLowerCase();
		s = s.replace(" ","");
		for(int i = 0,j = s.length()-1;i < j;i++,j--)
		{
			char sym1 = s.charAt(i);
			char sym2 = s.charAt(j);
			if(sym1 != sym2)
			{
				return false;
			}
		}
		return true;
	}
	/*
	 *        i++
	 *        01234     s.length() = 5
	 *  s -> "level"
	 *          --j 
	 *          
	 *        i->'e'  j->'e'   
	 */        
}
