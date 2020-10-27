package sub3;

/*
 * 날짜 : 2020/05/12
 * 이름 : 권기민
 * 내용 : 오버라이드 메서드 실습하기 교재 p295
 */

public class OverrideTest {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		// final : 상수
		// final 메서드 : 오버라이드 금지
		// final 클래스 : 상속 금지
		final int Num = 1;
		final double Pi = 3.14;
		// Num = 2; final 선언을 했기 때문에 변수값을 변경할 수 없음
		
		
	}
	
	
}
