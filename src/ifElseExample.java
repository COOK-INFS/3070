
public class ifElseExample {

	public static void main(String[] args) {
		
		int score = 11;
		
		
		if (score == 6) {
			System.out.println("A ifElseExample was scored!");
		} else if (score == 3) {
			System.out.println("This could be a field goal.");
		} else if (score < 3) {
			System.out.println("This is probably a safety.");
		} else {
			System.out.println("I have no idea what you're doing.");
		}

	}

}
