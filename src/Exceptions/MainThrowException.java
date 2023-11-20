package Exceptions;

public class MainThrowException {

	public static void main(String[] args)
	{
		double res = 0;
		try {
			res = division(6, 0);
			System.out.println("res = " + res);
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		}
		try {
			res = calculator(5,3, '#');
			System.out.println("res = " + res);
		} 
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		} 
		catch (WrongActionException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static double calculator(double a,double b,char action) 
												 throws ArithmeticException,
												 WrongActionException
	{
	    double res = 0;
	    switch(action)
	    {
	    case '+' : res = a + b;break;
	    case '-' : res = a - b;break;
	    case '*' : res = a * b;break;
	    case '/' :
	    	if(b == 0)
	    	{
	    		ArithmeticException e = 
	    			new ArithmeticException("Exception: division by zero");
	    		throw e; 
	    	}
	    	res = a / b;
	    	break;
	    default:
	    	WrongActionException e = 
	    		new WrongActionException("Exception: wrong action");
	    	throw e;
	    }
	    return res;
	}
	public static double division(double a,double b) throws Exception
	{
		if(b == 0)
		{
			Exception e = new Exception("Exception : division by zero");
			throw e;
		}
		return a / b;
	}
}
