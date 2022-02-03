
public class switchExample {

	public static void main(String[] args) {

		int score;
		score = 1;
		
		switch (score) {
		
		case 6:
			System.out.println("This is a touchdown!");
		break;
		
		case 2:
			System.out.println("This is a safety.");
		break;
		
		case 3:
			System.out.println("This is a field goal.");
		break;
		
		case 3000:
			System.out.println("This is an impossible score.");
		break;
		
		default:
			System.out.println("Nothing matches, what sport are you playing?");
		break;
		}

	}

}
