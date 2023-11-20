package Comparator2;

import InputOutput.Person;

import java.util.ArrayList;

public class MainPersonsList {

	public static void main(String[] args) {
		ArrayList<Person> list = 
				new ArrayList<Person>();
		Person p1 = new Person("Alice", 1, 25.5);
        Person p2 = new Person("Bob", 2, 30.0);
        Person p3 = new Person("Charlie", 3, 22.8);
        Person p4 = new Person("David", 4, 35.2);
        Person p5 = new Person("Eva", 5, 28.6);
        Person p6 = new Person("Frank", 6, 40.1);
        Person p7 = new Person("Grace", 7, 29.9);
        Person p10 = new Person("david", 9, 22.1);
        list.add(p4);
        list.add(p6);
        list.add(p3);
        list.add(p7);
        list.add(p5);
        list.add(p2);
        list.add(p1);
        list.add(p10);
        //System.out.println(list);
        printPersonsList(list);
        Person p9 = new Person("Grace", 7, 29.9);
        boolean res = list.contains(p9);
        System.out.println(res);
        list.remove(p9);
        printPersonsList(list);
        list.sort(null);
        printPersonsList(list);
        ComparatorPersonsByID cmp1 = 
        		new ComparatorPersonsByID();
        list.sort(cmp1);
        printPersonsList(list);
        ComparatorPersonsByNameReverse cmp2 = 
        		new ComparatorPersonsByNameReverse();
        list.sort(cmp2);
        printPersonsList(list);
        ComparatorPersonsByAge cmp3 = 
        		new ComparatorPersonsByAge();
        list.sort(cmp3);
        printPersonsList(list);
             

	}
	private static void printPersonsList(ArrayList<Person> list) {
		for(Person pr : list)
		{
			System.out.println(pr);
		}
		System.out.println("==========================");
	}

}
