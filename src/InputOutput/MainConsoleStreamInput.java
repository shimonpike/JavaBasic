package InputOutput;

import java.io.*;

public class MainConsoleStreamInput {
	public static void main(String[] args) {
		InputStreamReader is = 
				new InputStreamReader(System.in);
		BufferedReader br = 
				new BufferedReader(is);
		try {
			System.out.print("enter name>>>");
			String s = br.readLine();
			System.out.println(s);
			
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
