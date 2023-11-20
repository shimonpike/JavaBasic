
import java.util.*;

public class MainPersonList {

public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
ArrayList<Person> list = new ArrayList<>();
while(true)
{
	System.out.println("add new person");
	Person pr = getPerson(scan);
	list.add(pr);
	System.out.print("another Person ? yes or no>>>");
	String answer = scan.nextLine();
	if(answer.equalsIgnoreCase("no"))
	{
		scan.close();
		break;
	}
}
		for(Person p: list)
		{
			System.out.println(p);
		}
}
	private static Person getPerson(Scanner scan)
	{
		System.out.print("enter person name>>>");
		String name = scan.nextLine();
		System.out.print("enter ID>>>");
		int id = scan.nextInt();
		System.out.print("enter age>>>");
		double age = scan.nextDouble();
		
		Person p = new Person(name, id, age);
		return p;
	}

}
