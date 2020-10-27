package sub1;

/*
 * 날짜 : 2020/05/14
 * 이름 : 권기민
 * 내용 : 예외처리 실습하기 교재 p422
 */

public class ExceptionTest {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		
		// int r1 = num1 + num2;
		// int r2 = num1 - num2;
		// int r3 = num1 * num2;
		// int r4 = num1 / num2;			// 변수 2가 0이 될 경우 0으로는 어떤 것도 나눌 수 없으므로 나누기 연산에서 에러가 발생
		int r1 = 0, r2 = 0, r3 = 0;
		
		int r4 = 0;						// try 메서드 내에서 변수를 불러올 수 없기 때문에 먼저 변수를 생성해둔다.
										// try문에서 에러가 났을 경우 오류를 변수에 새로 대입하지 않고 선언해둔 변수를 그대로 출력한다.
		
		try {
			// 코드의 일관성을 유지하기(가독성) 위해서 에러가 발생할 가능성이 없지만 try메서드에 같이 써준다. 
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			
			// 에러가 발생할 가능석이 있는 로직
			r4 = num1 / num2;			// 변수 2가 0이 될 경우 0으로는 어떤 것도 나눌 수 없으므로 나누기 연산에서 에러가 발생
			
		}catch (Exception e){
			
			// 에러가 발생했을 때 처리할 로직
			e.printStackTrace();
		}
		
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		
		
		System.out.println("프로그램 종료...");
	}
	
}
