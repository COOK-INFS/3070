
public class classExample {

	public static void main(String[] args) {
		
		vehicle fordF350 = new vehicle(); // Create the object of the class vehicle
		
		fordF350.type = "Truck";
		fordF350.economy = 18;
		fordF350.speed = 100;
		fordF350.passengers = 5;
				
		
		
		vehicle jeepWrangler = new vehicle();
		
		jeepWrangler.type = "SUV";
		jeepWrangler.economy = 24;
		jeepWrangler.speed = 80;
		jeepWrangler.passengers = 5;
		
		
		System.out.println("The F350 can hold " + fordF350.passengers + " passengers.");
		System.out.println("The Jeep Wrangler gets " + jeepWrangler.economy + " mpg.");

		
	}

}

class vehicle{
	String type;
	int passengers;
	int speed;
	int economy; 
}
