package sub1;

/*
 * 날짜 : 2020/04/29
 * 이름 : 권기민
 * 내용 : 자바 배열 기초 실습하기 
 */

public class Arraytest {

	public static void main(String[] args) {
		
		// 변수 선언
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
		
		// 배열 선언
		int nums[] = {1, 2, 3, 4, 5};		// index는 각각 원소의 원소 번호를 말한다.
		
		// 배열의 길이
		System.out.println("배열 nums의 원소 갯수 : " + nums.length);
		
		/* 
		 * System.out.println("배열 nums의 1번째 원소 : " + nums[0]);
		 * System.out.println("배열 nums의 2번째 원소 : " + nums[1]);
		 * (System.out.println("배열 nums의 3번째 원소 : " + nums[2]);
		 * System.out.println("배열 nums의 4번째 원소 : " + nums[3]);
		 * System.out.println("배열 nums의 5번째 원소 : " + nums[4]);
		 */
		
		for(int i = 0; i<nums.length; i++) {
			System.out.println("배열 nums의 " + (i+1) + "번째 원소" + nums[i]);
		}
		
		
		
		// 확인문제
		String p1 = "김유신";
		String p2 = "김춘추";
		String p3 = "장보고";
		String p4 = "강감찬";
		String p5 = "이순신";
		
		String people[] = {p1, p2, p3, p4, p5};		// 배열 표시는 자유로움. String[] people, String []people, String people[] 다 됨.
		
		// 배열의 반복문				
		for(String person : people) {
			
			System.out.print(person+ ", ");
			
		}
		
		System.out.println();
		
		// 배열의 반복문
		for(int a = 0; a < 5; a++) {
			
			if( a < 4 ) {
				System.out.print(people[a] + ", ");
				
			}else {
				System.out.print(people[a]);
			}
		}
		
		System.out.println();
		
		// 배열의 반복문
		
		for(String person : people) {				
			
				if( people.length < 5 ) {
					System.out.print(person+ ", ");
					System.out.print(people.length);
				}else {
					System.out.print(person);
					System.out.print(people.length);
				}		
		}
		
		/*
		 *	for (자료형 변수 : 배열) {    // 배열의 값이 있으면 자료형 변수로 값을 보내주고			
		 *		  반복 실행할 문장               // 문장이 실행
		 *	}                        // 값이 없으면 종료 
		 *	          
		 *	
		 *	
		 *	예문
		 *	public class ForEachEx01 {
		 *		
		 *	public static void main(String[] args) {
		 *			int[] score = { 78, 70, 65, 98, 58 };
		 *			int sum = 0;
		 *		
		 *				for (int i : score) {
		 *					sum += i; // sum = sum + i;		
		 *				}
		 *				
		 *			System.out.println("점수 합계 : " + sum); // 결과 : 369
		 *			
		 *		}
		 *	}
		 */
		
	}

}
