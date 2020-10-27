package sub1;

/*
 * 날짜 : 2020/04/29
 * 이름 : 권기민
 * 내용 : 연산자 실습하기 
 */

public class OperatorTest {
	
	public static void main(String[] args) {
		// 산술연산자
		int num1 = 1;
		int num2 = 2;	
		int num3 = 3, num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num3 * num2;
		int rs4 = num4 / num2;
		int rs5 = num4 % num3;
			
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		System.out.println("rs5 : " + rs5);
		
<<<<<<< HEAD
		
		
		// 증감, 감소 연산자
		int n1 = 1;
		int n2 = 2;
		
		n1++;
		n2--;
		
		System.out.println("n1의 값 : " + n1);
		System.out.println("n2의 값 : " + n2);
		
		
		
		// 복합대입연산자
		int no1 = 1, no2 = 2, no3 = 3, no4 = 4;
		
		no1 += 1;	// no1 = no1 + 1;
		no2 -= 2;	// no2 = no2 - 1;
		no3 *= 3;	// no3 = no3 * 3;
		no4 /= 4;	// no4 = no4 / 4;
		
		
		System.out.println("변수 no1의 값 : " + no1);
		System.out.println("변수 no2의 값 : " + no2);
		System.out.println("변수 no3의 값 : " + no3);
		System.out.println("변수 no4의 값 : " + no4);
		
		
		
		// 비교연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean res1 = (var1 > var2);	// var1이 var2보다 크다.
		boolean res2 = (var1 < var2);	// var1이 var2보다 작다.
		boolean res3 = (var1 >= var2);	// var1이 var2보다 크거나 같다.
		boolean res4 = (var1 <= var2);	// var1이 var2보다 작거나 같다.
		boolean res5 = (var1 == var2);	// var1이 var2가  서로 같다.
		boolean res6 = (var1 != var2);	// var1이 var2가  서로 다르다.
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
		System.out.println("res6 : " + res6);
		
		
		
		// 논리연산자
		boolean r1 = (var1 > 0) && (var2 > 1);	// var1은 0보다 크고 var2는 1보다 크다.(&&, and)	true 두 조건 모두 참이기 때문에 true.
		boolean r2 = (var1 > 0) && (var2 > 2);	// var1은 0보다 크고 var2는 2보다 크다.(&&, and)	2번째 조건이 거짓이기 때문에 false가 나온다.
		boolean r3 = (var1 > 0) || (var2 > 2);	// var1은 0보다 크거나 var2는 2보다 크다.(||, or)	|| 연산은 둘 중 하나만 참이어도 true.
		boolean r4 = (var1 > 5) || (var2 > 3);	// var1은 5보다 크거나 var2는 3보다 크다.(||, or)	||는 둘 다 거짓일 경우 false.
		boolean r5 = !(var1 > var2);	// var1은 var2보다 크다.(!(조건문), not)	!(조건문)은 참일 경우 false를 거짓일 경우 true를 반환한다.
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		System.out.println("r5 : " + r5);
		
=======
		// 증감, 감소 연산자
		int n1 = 1;
		int n2 = 2;
		
		n1++;
		n2--;
		
		System.out.println("n1의 값 : " + n1);
		System.out.println("n2의 값 : " + n2);
		
		// 복합대입연산자
		
		// 비교연산자
		// 논리연산자
>>>>>>> refs/remotes/origin/master
	}
	
	
}
