package week2;

import java.io.*;

public class UpdateFile {
	static void modifyFile(String filePath,String oldString,String newString) {
		File fileToBeModified =new File(filePath);
		String oldContent ="";
		FileWriter writer =null;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
		    String line =reader.readLine();
		while(line!=null) {
			oldContent = oldContent+line+System.lineSeparator();
			line =reader.readLine();
			}
		String newContent = oldContent.replaceAll(oldString,newString);
		writer = new FileWriter(fileToBeModified);
		writer.write(newContent);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		finally {
		try {
		    reader.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
	

	public static void main(String[] args) {
		modifyFile("d://MATLAB//R2017b.txt","12","13");
		System.out.println("Done");
	}

}
