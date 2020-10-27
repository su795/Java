package sub2;

public class Shark extends Animal {

	@Override
	public void move() {
		System.out.println("Shark - move swim...");
	}
	
	@Override
	public void hunt() {
		System.out.println("Shark - hunt...");
	}
}
