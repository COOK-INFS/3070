import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReaderExample {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Get the filename to read
		System.out.println("Enter the name of the file to read: ");
		String filename = keyboard.nextLine();
		
		// Open the file
		File file = new File(filename);
		try {
			Scanner inputFile = new Scanner(file);
			
			// Read the file
			String line = inputFile.nextLine();
			
			// Display the first line
			System.out.println(line);
			
			// Close the file
			inputFile.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
