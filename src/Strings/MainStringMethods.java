package Strings;

public class MainStringMethods {

	public static void main(String[] args)
	{
	   String s = "money";
	   s = s.toUpperCase();
	   System.out.println(s);
	   s = s.toLowerCase();
	   System.out.println(s);
	   s = "	";
	   boolean res = s.isBlank();
	   System.out.println(res);
	   s = "performance";
	   s = s.replace("for","rof");
	   System.out.println(s);
	   s = "   hello world  ";
	   s = s.trim();
	   System.out.println(s);
	   //   012345678910
	   s = "performance";
	   String sub = s.substring(6);
	   System.out.println(sub);
	   sub = s.substring(3, 6);
	   System.out.println(sub);
	   
	   s = "hello,course,Tlalim";
	   //    0        1         2
	   //["hello"]["course"]["Tlalim"]
	   String[] ar = s.split(",");
	   for(String st: ar)
	   {
		   System.out.println(st);
	   }
	}

}
/*
    ""
    
    "money"  "MONEY" s->->"money"
      immutable

*/