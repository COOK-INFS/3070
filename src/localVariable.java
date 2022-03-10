
public class localVariable {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int results1;
		int results2;
		
		results1 = someNumbers(num1);
		System.out.println("The answer is: " + results1);
		
		results2 = addingNums(num1, num2);
		System.out.println("Adding both equals: " + results2);
		

	}
	
	/**
	 * This method is used for multiplying user input by 8.
	 * @param a User input from Java Swing UI window ID2345.
	 * @return
	 */
	
	public static int someNumbers(int a) {
		int nums = a*8;
		return nums;
	}
	
	public static int addingNums(int a, int b) {
		int nums = a+b;
		return nums;
	}
	
	

}
