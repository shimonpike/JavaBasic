import java.util.Objects;

public class Person implements Comparable<Person>{
  private String name;
  private int id;
  private double age;
  
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

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	return this.id == other.id;
}
@Override
public int compareTo(Person other) {
	int res = this.name.compareToIgnoreCase(other.name);
	//int res = Integer.compare(other.id, this.id);
	return res;
}

/*
 * 
       i   i+1 
         0       1      2  3  4  5  6   
      [p1][p2][1][5][6][3][6]
      this other
          temp[]
     if i > i+1 return  > 0 
     if i+1 > i return < 0
     if i == i+1 return 0
      


*/
  
  
}
