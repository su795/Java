package sub2;

/*
 * 날짜 : 2020/04/29
 * 이름 : 권기민
 * 내용 : 반복문 for 실습하기 
 */

public class ForTest {
	
	public static void main(String[] args) {
		
		// for
		for(int i = 1; i <= 3; i++) {
			System.out.println("Hello Java!");
		}
		
		
		
		// 1부터 10까지의 합
		int sum = 0;
		
		for(int k = 1; k <= 10; k++) {
  			sum += k;			
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		
		
		// 1부터 10까지의 짝수합
		int eSum = 0;
		
		for(int k = 1; k <= 10; k++) {
			if(k % 2 == 0) {
				eSum += k;
			}
		}
		
		System.out.println("1부터 10까지 짝수합 : " + eSum);
		
		
		
		// 이중 for문
		for(int a = 1; a <= 3; a++) {
			
			System.out.println("a : " + a);
			
			for(int b = 1; b <= 5; b++) {
				System.out.println("b : " + b);
			}
		}
		
		
		// 구구단
		for(int x = 2; x <= 9; x++) {
			
			System.out.println();
			System.out.println(x + "단");
			
			for(int y = 1; y <= 9; y++) {
				
				int z = x * y;
				System.out.println(x + "x" + y + " = " + z);
			}
		}
		
		System.out.print("\n");		// 줄 바꿈
		
		// 별 삼각형 I
		for(int start = 1; start <= 10; start++) {		// start가 10 미만인 경우 계속 반복된다.
			
			for(int end = 1; end <= start; end++) {
				
				System.out.print("☆");
				
			}
			
			// System.out.println();
			System.out.print("\n");
			
		}
		
		
		// 별 삼각형 I(역방향)
		for(int start = 10; start >= 1; start--) {		// start가 1보다 큰 경우 계속 반복되고 start가 1보다 작아지는 순간 반복문이 종료된다.
					
			for(int end = 1; end <= start; end++) {
				
				System.out.print("★");
				
			}
			
			System.out.println();
			
		}
		
		
		
		// 별 삼각형 II
		for(int a = 1; a <= 10; a++) {
			
			for(int b = 1; b <= 10-a; b++) {
				System.out.print("☆");
			}
			
			for(int c = 1; c <= a; c++) {
				System.out.print("★");
			}
			
			System.out.print("\n");
		}
		
		
		System.out.print("\n");
		
		
		// (응용)전부 빈부터 꽉 찬 별까지
		for(int a = 0; a < 11; a++) {
			
			for(int b = 1; b <= 10-a; b++) {
				System.out.print("☆");
			}
			
			for(int c = 1; c <= a; c++) {
				System.out.print("★");
			}
			
			System.out.print("\n");
		}
		
		
		
	}
}
