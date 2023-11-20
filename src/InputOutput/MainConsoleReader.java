package InputOutput;

import java.util.Scanner;

public class MainConsoleReader {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		//System.out.print("enter your name >>>");
		//String s = scan.nextLine();
		//System.out.println(s);
		System.out.print("enter any number >>>");
		int number = scan.nextInt();
		System.out.println("number x 2 = " + number*2);
		System.out.print("enter any double number >>>");
		double numD = scan.nextDouble();
		System.out.println("numD / 3 = " + numD / 3);
		
		/*
		 *  s = print(input("enter name>>>"))
		 */

	}

}
