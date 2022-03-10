
public class methodOverload {

	public static void main(String[] args) {
		double results = addition(7.5,3.5,5.5);
		System.out.println(results);

	}
	
	static int addition(int x, int y) {
		System.out.println("Using first method");
		return x+y;
	}
	
	static int addition(int x, int y, int z) {
		System.out.println("Using second method");
		return x+y+z;
	}
	
	static double addition(double x, double y, double z) {
		System.out.println("Using third method with different type.");
		return x+y+z;
	}

}
