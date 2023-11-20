package Files;

import Files.Person;

import java.io.*;
import java.util.*;

public class MainArrayListToFile {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\RedmiBook\\testfolder\\testfile.txt";
		File fl = new File(filePath);
		ArrayList<Person> list =  new ArrayList<>();
		readListFromFile(list,fl);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		mainMenu(list,fl,br);
		   /*InputOutput.Comparator2.Arrays.Person p1 = new InputOutput.Comparator2.Arrays.Person("Alice", 1, 25.5);
	       InputOutput.Comparator2.Arrays.Person p2 = new InputOutput.Comparator2.Arrays.Person("Bob", 2, 30.0);
	       InputOutput.Comparator2.Arrays.Person p3 = new InputOutput.Comparator2.Arrays.Person("Charlie", 3, 22.8);
	       InputOutput.Comparator2.Arrays.Person p4 = new InputOutput.Comparator2.Arrays.Person("David", 4, 35.2);
	       list.add(p1);
	       list.add(p2);
	       list.add(p3);
	       list.add(p4);
	   	   printPersonsList(list);
	       writeListToFile(list,fl);
	      */
	}
    
	private static 
	void mainMenu(ArrayList<Person> list, File fl, BufferedReader br)
	{
		System.out.println("Welcome...");
	while(true)
	{
		System.out.println("Please choose option:");
		System.out.println("1. add new person");
		System.out.println("2. display persons");
		System.out.println("3. save persons to file");
		System.out.println("4. save and exit");
		System.out.println("5. exit without saving");
		System.out.println("6. remove person by ID");
		try {
			String answer = br.readLine();
			switch(answer)
			{
			case "1" : 
				Person p = getPersonFromConsole(br);
				list.add(p);
				break;
			case "2" : printPersonsList(list);
				break;
			case "3" : writeListToFile(list, fl);
				break;
			case "4" :  
				writeListToFile(list, fl);
				System.out.println("Bye,bye...");
				br.close();
				return;
			case "5" :
				System.out.println("Bye,bye...");
				br.close();
				return;
			case "6" :
				removePersonByID(list,br);
				break;
			}
	    }
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	}

	private static 
	void removePersonByID(ArrayList<Person> list, BufferedReader br) 
			                   throws IOException {
		System.out.println("remove person by ID...");
		System.out.print("enter ID>>>");
		String answer = br.readLine();
		int id = Integer.parseInt(answer);
		for(Person p : list)
		{
			if(p.getId() == id)
			{
				list.remove(p);
				System.out.println("Removed successfully !");
				return;
			}
		}
		System.out.println("ERROR: wrong id");
	}

	private static Person getPersonFromConsole(BufferedReader br)
			                              throws IOException {
		System.out.println("add new person...");
		System.out.print("enter person's name>>>");
		String name = br.readLine();
		System.out.print("enter ID>>>");
		String answer = br.readLine();
		int id = Integer.parseInt(answer); 
		System.out.print("enter age>>>");
		answer = br.readLine();
		double age = Double.parseDouble(answer);
		Person p = new Person(name, id, age);
		return p;
	}

	private static void printPersonsList(ArrayList<Person> list) {
		for(Person p: list)
		{
		  System.out.println(p);	
		}
		System.out.println("=====================");
	}

	private static void readListFromFile(ArrayList<Person> list, File fl) {
		if(fl.exists() == false)
		{
			System.out.println("The is not exists");
			return;
		}
		try {
			FileReader fr = new FileReader(fl);
			BufferedReader br = new BufferedReader(fr);
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;
				// line = "Haim#1234#23.5"
				Person p = getPerson(line);
				list.add(p);
			}
			br.close();
		} catch (IOException e) {
			System.out.println();
		}
	}

	private static Person getPerson(String line) {
		// line = "Haim#1234#23.5"
		String[] ar = line.split(Person.DELIMETER);
		//     0       1       2
		//ar["Haim"]["1234"]["23.5"]
		String name = ar[0];
		int id =Integer.parseInt(ar[1]);
		double age = Double.parseDouble(ar[2]);
		Person p = new Person(name, id, age);
		return p;
	}

	private static void writeListToFile(ArrayList<Person> list, File fl) {
		try {
			FileWriter fw = new FileWriter(fl);
			BufferedWriter bw = new BufferedWriter(fw);
			for(Person p : list)
			{
				bw.write(p.strToFile());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	
	

}
