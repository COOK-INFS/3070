import java.util.InputMismatchException;
import java.util.Scanner;


public class tryCatchExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		System.out.println("Enter a whole number: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter a number to divide by: ");
		int b = scanner.nextInt();
		
		int c = a/b;
		
		System.out.println("Equals: " + c);
		
		}catch (ArithmeticException e) {
			System.out.println("You can't divide by 0!");
		}catch (InputMismatchException e) {
			System.out.println("You MUST enter a number, please try again.");
		}catch (Exception e) {
			System.out.println("Something isn't right!");
		}
		
		finally {
			System.out.println("This statement always runs!!!");
			
			scanner.close();
		}
		
		
		

	}

}
