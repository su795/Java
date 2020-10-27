package sub1;

public interface RemoteControl {

	public abstract void powerOn(
		//	System.out.println("인터페이스 클래스는 추상메서드에서 어떠한 선언도 할 수 없음")
	);
	public abstract void powerOff();

	// abstract 생략가능
	public void chUp();
	public void chDown();
	
	public abstract void soundUp();
	public abstract void soundDown();
	
	
}
