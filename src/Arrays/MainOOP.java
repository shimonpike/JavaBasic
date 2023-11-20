
public class MainOOP {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Serg");
		p1.setID(1234);
		p1.setAge(23.5);
		p1.display();
		/*System.out.println(p1.getName());
		System.out.println(p1.getID());
		System.out.println(p1.getAge());
		*/	
		Person p2 = new Person();
		p2.setName("Hanna Ivanov");
		p2.setID(5432);
		p2.setAge(23.5);
		p2.display();
		
		Person p3 = new Person("John Smith", 6543,12.5);
		p3.display();
		
	}
	/*
	 *  p3->[name="John Smith" id = 6543  age = 12.5]
	 *  p2->[name=null id = 0 age = 0.0]
	 *  p1->[name=null id = 0 age = 0.0]
	 * 
	 * 
	 * 
	 * 
	 */
   /*
    *   Person
    *   --------
    *   name
    *   id
    *   age
    *   ....
    *   
    *   Car
    *   ---
    *   model
    *   year
    *   engine
    *   ....
    *   
    *   Book
    *   ----
    *   author
    *   title
    *   pages
    *   isbn
    *   ....
    *   
    *   
    *   
    *   
    *   
    *   
    *   
    *   
    *   
    * 
    * 
    * 
    * 
    * 
    * 
    */
}
