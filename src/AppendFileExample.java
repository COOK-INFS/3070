import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendFileExample {

	public static void main(String[] args) {
		
		String fileName;
		String friendName;
		int numFriends;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Get the number of friends
		System.out.println("How many friends do you have?");
		numFriends = keyboard.nextInt();
		
		// Create a new line
		keyboard.nextLine();
		
		// Prompt for the filename
		System.out.println("Enter your filename: ");
		fileName = keyboard.nextLine();
		
		// Create the file
		try {
			FileWriter fwriter = new FileWriter(fileName, true);
			PrintWriter outputFile = new PrintWriter(fwriter);
			
			// Get the data and write it to the file
			for(int i=1; i<= numFriends; i++) {
				System.out.println("Enter the name of friend " + "number " + i + ": ");
				friendName = keyboard.nextLine();
				
			// Write the name to the file
				outputFile.println(friendName);
				
			}
			
			// Close the file
			outputFile.close();
			System.out.println("The data has been written to the file.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		keyboard.close();

	}

}