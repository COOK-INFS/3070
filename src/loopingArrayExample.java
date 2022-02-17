import java.util.Scanner;

public class loopingArrayExample {

	public static void main(String[] args) {

		int[] grades = {87, 76, 98, 100, 56};
		
		int values;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What grade are you searching for? ");
		values = scanner.nextInt();
		
		for(int i=0; i<grades.length; i++) {
			if(grades[i] ==values) {
				System.out.println("I found it at index: " + i);
			}
		}

	}

}
