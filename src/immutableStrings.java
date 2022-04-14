
public class immutableStrings {

	public static void main(String[] args) {

		String name = "Bob";
		name = "Mary";
		
		
		
		
		String name2 = "Mary";
		String name3 = new String("Mary");
		
		System.out.println(name2 == name3);
		
	}

}
