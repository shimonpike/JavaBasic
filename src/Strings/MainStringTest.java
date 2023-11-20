
public class MainStringTest {

	public static void main(String[] args)
	{
		String s = "hello";
		printStrReverse(s);
		int res = charCount(s, 'l');
		System.out.println("count = " + res);
		String rev = reverseStr(s);
		System.out.println(rev);

	}
	public static String reverseStr(String s)
	{
		String sRev = "";
		for(int i = s.length()-1;i >= 0;i--)
		{
			char sym = s.charAt(i);
			sRev += sym;
		}
		return sRev;
	}
	/*     i
	 *      01234    
	 *  s->"hello"   sRev ->"olleh" 
	 *  
	 */  
	public static int charCount(String s,char c)
	{
		int count = 0;
		for(int i = 0;i < s.length();i++)
		{
			char sym = s.charAt(i);
			if(sym == c)
				count++;
		}
		return count;
	}
	/*         i
	 *      01234    c = 'l'
	 *  s->"hello"            s.charAt(3) => 'l'
	 *  
	 *  
	 */  
	 public static void printStrReverse(String s)
	 {
		 for(int i = s.length()-1;i >= 0;i--)
		 {
			 System.out.print(s.charAt(i));
		 }
		 System.out.println();
	 }
	/*     --i
	 *   01234 
	 *  "hello"
	 * 
	 * 
	 * 
	 * 
	 */
}
