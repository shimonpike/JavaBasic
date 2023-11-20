import java.io.*;
import java.util.*;


public class MainConsoleStreamPersonsList {

	public static void main(String[] args) {
		InputStreamReader is = 
				   new InputStreamReader(System.in);
		BufferedReader br = 
				     new BufferedReader(is);
		ArrayList<Person> list = 
				new ArrayList<>();
while(true) 
{
		System.out.println("add new person...");
		Person p = getPerson(br);
		list.add(p);
		System.out.print("another person? yes or no>>>");
		try {
			String answer = br.readLine();
			if(answer.equalsIgnoreCase("no"))
			{
				br.close();
				break;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
}
	
	
	
		for(Person pr : list)
		{
			System.out.println(pr);
		}
     }

	private static Person getPerson(BufferedReader br) 
	{
		Person pr = null;
		try {
			System.out.print("enter person name>>>");
			String name = br.readLine();
			System.out.print("enter ID>>>");
			String answer = br.readLine();
			int id = Integer.parseInt(answer);
            System.out.print("enter age>>>");
			answer = br.readLine();
			double age = Double.parseDouble(answer);
			pr = new Person(name, id, age);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return pr;
	}

}
