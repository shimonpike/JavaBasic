package Files;

import java.io.*;

public class MainFileWrite {
	public static void main(String[] args) {
		String homePath = System.getProperty("user.home");
		System.out.println(homePath);
		String folderPath = homePath + "\\testfolder";
		File fld = new File(folderPath);
		boolean res = fld.mkdirs();
		if(res) {
			System.out.println("folder created");
			System.out.println(fld.getAbsolutePath());
		}
		String filePath = folderPath + "\\testfile.txt";
		File fl = new File(filePath);
        try {
			res = fl.createNewFile();
			if(res) {
				System.out.println("file created");
				System.out.println(fl.getAbsolutePath());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
        try {
			FileWriter fw = new FileWriter(fl);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello");
			bw.newLine();
			bw.write("World");
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
