
public class layeredMethod {

	public static void main(String[] args) {
		System.out.println("I'm starting in Main method.");
		deep();
		System.out.println("Now I'm back in main.");

	}
	
	public static void deep() {
		System.out.println("I am now in deep.");
		deeper();
		System.out.println("Now I'm back in deep.");
	}
	
	public static void deeper() {
		System.out.println("I am now in deeper.");
	}

}
