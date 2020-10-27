package p370;

import p367p368.HankookTire;
import p367p368.Tire;

public class Car {

	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};

	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
