package sub3;

/*
 * 날짜 : 2020/05/14
 * 이름 : 권기민
 * 내용 : 예외 떠넘기기 실습하기 교재 p440
 */

public class ThrowsTest {

	public static void main(String[] args) {			// public static void main(String[] args) throws Exception {} 
														// main()메서드에서도 throws Exception을 적용해서 JVM에 던져도 된다.
														// 그러면 하단의 연산에 try,catch를 안써도 됨
		
		// 싱글톤 객체 얻어오기
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		
		// 에러가 발생할 throws 선언된  메서드(div)를 호출하는 쪽에서는 예외처리(try-catch)를 해야함
		// 또는 다시 throws 선언으로 main을 호출하는 자바 JVM으로 예외를 던짐
		int r4 = 0;
		
		try {
			r4 = c.div(4, -41);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
	}
}
