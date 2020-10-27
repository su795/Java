package p361p362;

import p349p354.RemoteControl;
import p349p354.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		
	}
}
