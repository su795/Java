package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		
		return num;
	}
	
	// synchronized
	// 동기화 블록선언으로 스레드간 경합을 막는다.
	public synchronized void setNum() {
		
		num++;
	
	// 싱크로나이즈드 메서드로 불어와도 병렬 누락현상을 방지할 수 있음.
//		synchronized(this) {
//			num++;
//		}
	}
}
