
public class Person {
  private String name;
  private int id;
  private double age;
  public static final String DELIMETER = "#";
  
public Person(String name, int id, double age) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getAge() {
	return age;
}
public void setAge(double age) {
	this.age = age;
}
@Override
public String toString() {
	return "name=" + name 
			+ ", id=" + id 
			+ ", age=" + age;
}
public String strToFile()
{
	String str = name + DELIMETER + id + DELIMETER + age;
	return str;
}
 // Haim#1234#23.5
  
  
  
  

}
