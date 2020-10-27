package sub3;

public class Cable implements Socket {

	// ¸â¹öº¯¼ö ¼±¾ð(Ä¸½¶È­)
	private Bulb bulb;
	
	// »ý¼ºÀÚ ¼±¾ð
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();	
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
		
	}
	
}
