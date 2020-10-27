package sub3;

public class Adder {
	
	// 멤버 변수
	private int x;
	
	// 생성자
	Adder(int x) {
		this.x = x;
	}
	
	// getter, setter
	// 	- 외부에서 멤버변수에 대한 직접 참조가 필요할 경우 사용하는 메서드
	//  - 멤버변수를 private 선언하면 외부에서 조회, 참조가 불가능하다.
	public int getX() {
		return x;
	}	
	public void setX(int x) {		// 멤버 변수 x에 매개변수 x값을 대입
		this.x = x;
	}
	
	
	
	
	public void add(int x) {
		this.x = x + 50;
	}
	public void add(int[] arr) {
		arr[0]++;
	}
	public void add(Adder a1) {
		int x = a1.getX() + 40;
		
		a1.setX(x);
	}

	public Adder addNew(Adder a2) {
		a2 = new Adder(1);
		return a2;
	}
	
}
