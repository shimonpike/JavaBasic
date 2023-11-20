import java.io.*;

public class MainFilesFolders {

	public static void main(String[] args)
	{
		String homePath = System.getProperty("user.home");
		System.out.println(homePath);
		String folderPath = homePath + "\\masa\\1\\2\\3\\4";
		//                           + "/masa/1/2/3";
		System.out.println(folderPath);
		File folder = new File(folderPath);
		boolean res = folder.mkdirs();
		if(res == true)
			System.out.println("folders created");
		String fileName = "test.txt";
		String filePath = homePath + "\\masa\\" + fileName;
		System.out.println(filePath);
		File fl = new File(filePath);
		try {
			res = fl.createNewFile();
			if(res == true)
				System.out.println("file created");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		//fl.delete();
		res = fl.exists();
		if(res == true)
			System.out.println("file exists");
		String path = fl.getAbsolutePath();
		System.out.println(path);
		String parent = fl.getParent();
		System.out.println(parent);
		File home = new File(homePath);
		String[] ar = home.list();
		for(String s : ar)
		{
			System.out.println(s);
		}
		
		
		
		

	}

}
/*
homePath = "C:\Users\RedmiBook" + "\masa" => "C:\Users\RedmiBook\masa"
*/










