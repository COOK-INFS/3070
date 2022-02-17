import java.util.ArrayList;
import java.util.Scanner;

public class StringArraySearch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String search;
		
		ArrayList<String> people = new ArrayList<>();
		
		people.add("Bob");
		people.add("Mary");
		people.add("Fred");
		people.add("Sarah");
		people.add("Frank");
		
		System.out.println("What would you like to search for? ");
		search = scanner.nextLine();
		
		System.out.println("What I found: ");
		
		for(String element:people) {
			if(element.contains(search)) {
				System.out.println(element);
			}
		}

	}

}
