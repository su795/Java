package sub1;

import java.util.Scanner;

/*
 * 	날짜 : 2020/05/01
 * 	이름 : 오세훈
 * 	내용 : 조건문 if 실습하기
 */

public class IfTest {

	public static void main(String[] args) {
		
		// if					분기문 - 조건에 맞을 경우 블럭부분 로직 실행, 조건에 맞지 않을 경우 로직을 실행하지 않고 진행
		int num1 = 1;
		int num2 = 2;
	
		if( num1 < num2 ) {
			// 블럭
			System.out.println("num1의 num2보다 작다.");	// 블럭
			// 블럭
		}				
		
		// 여러 분기에 걸쳐 실행문이 일어나는 것을 쓰레드라고 한다.
		if( num1 > 0 ) {
			if(num2 > 1 ) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
			}
		}
		
		if( num1 > 0 && num2 > 1 ) {
			System.out.println("num1은 0보다 크고 그리고 num2는 1보다 크다.");
		}
		
		
		
		
		// if ~ else
		if ( num1 > num2 ) {
			System.out.println("num1은 num2보다 크다.");
		} else {
			System.out.println("num1은 num2보다 작다.");
		}
		
		
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if( n1 > n2 ) {
			System.out.println("n1은 n2보다 크다.");
		} else if ( n2 > n3 ) {
			System.out.println("n2은 n3보다 크다.");
		} else if( n3 > n4 ) {		
			System.out.println("n3은 n4보다 크다.");
		} else {
			System.out.println("n4가 제일 크다.");
		}
		
		
		
		// 연습문제
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");		// println() 함수는 출력 후 줄바꿈 하는 함수
		int score = sc.nextInt();		
		
		System.out.println("입력하신 점수는 " + score + "입니다.");
		
		if( score > 100 ) {
			System.out.println("점수는 100점 미만으로 입력해 주십시오.");
		} else if( score >= 90 && score < 100 ) {
			System.out.println("등급은 A입니다.");
		} else if( score >= 80 && score < 90 ) {
			System.out.println("등급은 B입니다.");
		} else if( score >= 70 && score < 80) {
			System.out.println("등급은 C입니다.");
		} else if( score >= 60 && score < 70 ) {
			System.out.println("등급은 D입니다.");
		} else {
			System.out.println("등급은 F입니다.");
		}
		
		
		
		
		
	}
	
}
