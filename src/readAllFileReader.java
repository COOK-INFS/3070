import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readAllFileReader {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Get the filename
		System.out.println("Enter the name of the file: ");
		String filename = keyboard.nextLine();
		
		// Open the file
		File file = new File(filename);
		try {
			Scanner inputFile = new Scanner(file);
			
			// Loop through the lines in the file
			while(inputFile.hasNext()) {
				String fileLines = inputFile.nextLine();
				
				System.out.println(fileLines);
			}
			
			// Close the file
			inputFile.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

		
	}

}
