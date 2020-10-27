package p376;

import p374p375.Bus;
import p374p375.Vehicle;

public class Driver {

	public void drive(Vehicle vehicle) {
		
		if(vehicle instanceof Bus) {
			
			Bus bus = (Bus) vehicle;
			
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
