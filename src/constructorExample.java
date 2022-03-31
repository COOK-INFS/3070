
public class constructorExample {

	public static void main(String[] args) {
		
		vehicle2 fordF350 = new vehicle2("Truck", 5, 100, 18, 35);
		vehicle2 jeepWrangler = new vehicle2("SUV" , 4, 90, 24, 20);
		
		System.out.println("F350 can hold " + fordF350.passengers + " passengers.");
		System.out.println("Jeep can store " + jeepWrangler.fuelCapacity + " gallons.");
		
	}

}

class vehicle2 {
	String type;
	int passengers;
	int speed;
	int economy;
	int fuelCapacity;
	
	vehicle2(String t, int p, int s, int e, int fc){
		type = t;
		passengers = p;
		speed = s;
		economy = e;
		fuelCapacity = fc;
	}
	
}