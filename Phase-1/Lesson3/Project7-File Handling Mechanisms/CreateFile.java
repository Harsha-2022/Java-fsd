package week2;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();
	}

	private static void createFileUsingFileClass() throws IOException {
		File file =new File("d://MATLAB//R2017b.txt");
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File already exists");
		}
		FileWriter writer =new FileWriter(file);
		writer.write("Create file data");
		writer.close();
		
	}

}
