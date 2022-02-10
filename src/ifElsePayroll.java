import java.util.Scanner;

public class ifElsePayroll {

	public static void main(String[] args) {
		
		// Establish variables to use
		double rate;
		double hoursWorked;
		double regularPay;
		double overtimePay;
		final int full_wk = 40;
		final double ot_rate = 1.5;
		
		// Create Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Get hours from the user
		System.out.println("How many hours did you work? ");
		hoursWorked = keyboard.nextDouble();
		
		// Get the users regular pay rate
		System.out.println("What is your pay rate? ");
		rate = keyboard.nextDouble();
		
		//Determine if the user gets overtime
		if (hoursWorked > full_wk) {
			regularPay = full_wk * rate;
			overtimePay = (hoursWorked - full_wk) * ot_rate * rate;
		}else {
			regularPay = hoursWorked * rate;
			overtimePay = 0.0;
		}
		
		// Print out results
		System.out.println("Regular pay is: $" + regularPay + "\nOvertime Pay is: $" + overtimePay);

		keyboard.close();
	}

}
