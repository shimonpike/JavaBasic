import java.util.Comparator;

public class ComparatorPersonsByAge implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		double age1 = p1.getAge();
		double age2 = p2.getAge();
		
		return Double.compare(age1, age2);
	}

}
