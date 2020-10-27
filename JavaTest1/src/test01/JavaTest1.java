package test01;

/*
 * 날짜 : 2020/05/01
 * 이름 : 권기민
 * 내용 : 자바 데이터 타입 연습문제 
 */

public class JavaTest1 {

	public static void main(String[] args) {
		
		char    var1 = 'A';
		int     var2 = 100;
		long    var3 = 2147483648L;		// int는 2147483647까지 저장가능. 자바 이외의 언어에서는 접미사 L을 생략해도 인식된다.
		float   var4 = 3.14f;
		double  var5 = 3.14159;
		boolean var6 = true;
		boolean var7 = false;
		String  var8 = "Hello";
		String  var9 = null;			// String은 객체이기때문에 초기화하는 방법으로 String 변수 = null;을 쓴다.	Stirng 대신 Object도 가능
										// 다른 자료형은 객체가 아니기때문에 쓰일 수 없다.
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);
		
	}
}

