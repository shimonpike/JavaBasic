
public class MainErrorTest {

	public static void main(String[] args) {
	int size = Integer.MAX_VALUE;
	while(true)
	{
		try {
		int[] ar = new int[size];
		break;
		}
		catch(Error e)
		{
			System.out.println(e.getMessage());
			size /= 2 ;
		}
	}
		System.out.println("size (MBT)= " + (size*4)/1024/1024);
		
		System.out.println("END");
	}

}
