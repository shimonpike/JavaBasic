package Comparator2;

import java.util.Comparator;

public class ComparatorPersonsByID 
	implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		int id1 = p1.getId();
		int id2 = p2.getId();
		
		return Integer.compare(id1, id2);
	}
	

}
