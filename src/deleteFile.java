import java.io.File;
import java.util.Scanner;

public class deleteFile {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		// Prompt for the file to be deleted
		System.out.println("Enter the name of the file to delete: ");
		String filename = keyboard.nextLine();
		
		File fileDelete = new File(filename);
		
		if (fileDelete.delete()) {
			System.out.println("File has been removed.");
		}

	}

}
