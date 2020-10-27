package p356p357p359;

import p349p354.Audio;
import p349p354.RemoteControl;
import p349p354.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
