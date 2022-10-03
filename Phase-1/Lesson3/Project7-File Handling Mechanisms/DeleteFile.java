package week2;

import java.io.IOException;
import java.nio.file.*;


public class DeleteFile {

	public static void main(String[] args) {
		try {
			Files.deleteIfExists(Paths.get("d://MATLAB//R2017b.txt"));
		} catch (NoSuchFileException e) {
			System.out.println("No such directory/file exists");
		} catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty");
		} catch (IOException e) {
			System.out.println("Invalid Permissions");
		}
		System.out.println("Deletion successful");
	}

}
