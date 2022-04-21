
public class vehicleFeaturesApp {

	public static void main(String[] args) {
		
	jeepWrangler jeep = new jeepWrangler();
	jeep.airConditioning();
	jeep.cruiseControl();
	jeep.selfDriving();
	jeep.tintedWindows();
	jeep.liftKit();
	
	
	System.out.println("-----------------------------");
	
	f350 f350 = new f350();
	f350.selfDriving();
	f350.liftKit();
	
	System.out.println("------------------------------");
	
	prius prius = new prius();
	prius.liftKit();

	}

}
