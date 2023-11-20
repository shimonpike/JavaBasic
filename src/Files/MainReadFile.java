import java.io.*;

public class MainReadFile {

	public static void main(String[] args) {
		String homePath = System.getProperty("user.home");
		System.out.println(homePath);
		String folderPath = homePath + "\\testfolder";
		
		String filePath = folderPath + "\\testfile.txt";
		System.out.println(filePath);
		File fl = new File(filePath);
		
		try {
			FileReader fr = new FileReader(fl);
			BufferedReader br = new BufferedReader(fr);
			while(true)
			{
			   String s  = br.readLine();
			   if(s == null)
				   break;
			   System.out.println(s);
			}
			br.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		

	}
//"C:\Users\RedmiBook\testfolder\testfile.txt"
}
