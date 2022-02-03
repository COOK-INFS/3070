import java.util.Scanner;

public class scannerUtilityExample {

	public static void main(String[] args) {
		
		// Creating variables to get user input in our program.
		String name;
		int hours;
		double payRate;
		double grossPay;
		
		// Create an object to read the keyboard input from users.
		Scanner keyboard = new Scanner(System.in);
		
		
		// Get users name
		System.out.println("What's your name? ");
		name = keyboard.nextLine();
		
		// Get the number of hours worked
		System.out.println("How many hours did you work? ");
		hours = keyboard.nextInt();
		
		// Get users hourly pay rate
		System.out.println("What is your hourly rate? ");
		payRate = keyboard.nextDouble();
		
		// Calculate the gross pay
		grossPay = hours * payRate;
		
		keyboard.close();
		
		System.out.println("Hello, " + name);
		System.out.println("Your gross pay is $" + grossPay);

	}

}
