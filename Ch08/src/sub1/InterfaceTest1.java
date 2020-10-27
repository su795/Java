package sub1;

/*
 * 날짜 : 2020/05/13
 * 이름 : 권기민
 * 내용 : 인터페이스 실습하기
 */

public class InterfaceTest1 {

	public static void main(String[] args) {
		
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.powerOff();
		lg.chUp();
		lg.chDown();
		lg.soundUp();
		lg.soundDown();
		
		samsung.powerOn();
		samsung.powerOff();
		samsung.chUp();
		samsung.chDown();
		samsung.soundUp();
		samsung.soundDown();
	}
}
