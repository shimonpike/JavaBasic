package Arrays;

public class Person {
	//fields
	private String name;
	private int id;
	private double age;
	
	//default constructor	
	public Person()
	{
		System.out.println("default constructor");
	}
	//custom constructor
	public Person(String n,int i,double a)
	{
		if(n != null)
			name = n;
		if(i > 0)
			id = i;
		if(a > 0)
			age = a;
	}
	//setters
	public void setName(String n)
	{
		if(n != null)
			name = n;
		else
			System.out.println("ERROR : wrong name");
	}
	public void setID(int i)
	{
		if(i > 0)
			id = i;
		else
			System.out.println("ERROR : wrong id");
	}
	public void setAge(double a)
	{
		if(a > 0)
			age = a;
		else
			System.out.println("ERROR : wrong age");
	}
	// getters
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}
	public double getAge()
	{
		return age;
	}
	//custom methods
	public void display()
	{
		System.out.print("Name: " + name);
		System.out.print("  ID: " + id);
		System.out.println("  Age: " + age);
	}
	
}
