package sub2;

/*
 * 날짜 : 2020/05/07
 * 이름 : 권기민
 * 내용 : 자바 클래스 실습하기
 */

/* Object Oriented Programing	객체 지향 프로그래밍 */

public class ClassTest {

		public static void main(String[] args) {
			
			int num1 = 1;
			int num2 = 2;
			
			
			
			// 국민은행 객체 생성 및 초기화
			Account kb = new Account("국민은행", "121-12-1234", "김춘추", 10000);		// kb는 객체	Account는 클래스
		//  1---------4-_2----------3---------------------------------------
			// 1.참조변수 선언		2.생성자 선언		3.생성자의 실행 및 호출	   4.대입
			
			
			// 초기화(Class의 멤버변수를 private로 선언할 경우 생성자를 이용해서 초기화해줘야한다.)
			// kb.bank = "국민은행";
			// kb.id = "121-12-1234";
			// kb.name = "김춘추";
			// kb.money = 10000;
			
		// 입금, 출금, 조회하기
			kb.deposit(10000);
			kb.withdraw(5000);
			// kb.money--; 		// 객체의 멤버변수의 캡슐화를 통한 취약코드 예방, 멤버변수를 private로 캡슐화하기 전에는 구문 변경이 자유롭다.
			kb.info();
			
			// 신한은행 객체 생성 및 초기화
			Account sh = new Account("신한은행", "121-11-1234", "김유신", 30000);
			
			// 초기화
			// sh.bank = "신한은행";
			// sh.id = "121-11-1234";
			// sh.name = "김유신";
			// sh.money = 30000;
			
			// 입금, 출금, 조회하기
			sh.deposit(10000);
			sh.withdraw(8000);
			sh.info();
		}   
}

