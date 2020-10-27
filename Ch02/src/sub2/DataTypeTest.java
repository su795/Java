package sub2;

	/*
	 * 날짜 : 2020/04/29
	 * 이름 : 권기민
	 * 내용 : 변수의 자료형(데이터 타입) 실습하기 
	 */

public class DataTypeTest {
	
	public static void main(String[] args) {
		
		// 정수형
		byte var1 = 1;			// byte는 8bit라서 127까지 밖에 저장할 수 없다. 2(7승)*2(6승)*2(5승)*2(4승)*2(3승)*2(2승)*2(1승)*2(0승) = 127
		short var2 = 2;
		int var3 = 2147483647;
		long var4 = 465146516854168516L;			// int보다 큰 값에는 접미사 L을 붙여야한다.
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		
		
		// 실수형
		float var5 = 1.123456789f;					// float는 접미사 f를 반드시 맨 끝에 붙여줘야한다.	소수점 7자리까지 나옴. 소수점7자리 이후 숫자는 반올림 된다.
		double var6 = 1.23456789123546388469;		// double은 소수점 16자리까지 나온다.
		
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		
		
		
		// 논리형
		boolean var7 = true;
		boolean var8 = false;
		
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		
		
		
		// 문자형
		char ch1 = 'A';
		char ch2 = '가';
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		
		// 문자열(단어)
		String str1 = "A";
		String str2 = "Hello";
		String str3 = "안녕";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
	}
	
}
