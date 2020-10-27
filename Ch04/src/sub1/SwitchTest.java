package sub1;

import java.util.Scanner;

/*
 * 	날짜 : 2020/05/01
 * 	이름 : 권기민
 * 	내용 : 조건문 Switch 실습하기
 */

public class SwitchTest {
	
	public static void main(String[] args) {
		
		int num = 3;
		
		switch(num) {			// 변수를 입력한다. 변수를 가지고 분기한다.
		case 1:
			
			System.out.println("num은 1입니다.");
			break;
			
		case 2:
			
			System.out.println("num은 2입니다.");
			break;
			
		case 3:
			
			System.out.println("num은 3입니다.");
			break;
			
		default:
			
			System.out.println("num은 1, 2, 3이 아닙니다.");
			break;
		}
		
		// 연습문제
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		int grade = score / 10;
		
		switch(grade) {
		case 10:			
			System.out.println("등급은 A입니다.");
			break;
			
		case 9:			
			System.out.println("등급은 A입니다.");
			break;
			
		case 8:			
			System.out.println("등급은 B입니다.");
			break;
			
		case 7:			
			System.out.println("등급은 C입니다.");
			break;
			
		case 6:
			System.out.println("등급은 D입니다.");
			break;
			
		default:
			System.out.println("등급은 F입니다.");
			break;
		}
		
		
	}
}
