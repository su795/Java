package sub2;

/*
 * 날짜 : 2020/05/04
 * 이름 : 권기민
 * 내용 : 반복문 while 실습하기 
 */

public class WhileTest {
	
	public static void main(String[] args) {
	
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while( k <= 10 ) {
			sum += k;			// 여기까지만 하면 +1 +1 +1 ... 무한 반복 된다.
			k++;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		
		
		// do-while
		int eSum = 0;
		int i = 1;
		
		do {
			if( i%2 == 0) {
				eSum += i;				
			}
			
			i++;
			
		}while(i <= 10);
		
		System.out.println("1부터 10까지 짝수합 : " + eSum);
		
	
		
		// break
		int num = 0;	// declare(선언)이자 initialize(초기화)                  
						// 초기화란 RAM에 최초로 데이터를 저장해놓는 것을 말한다.
		
		while(true) {
			
			num++;
			
			if(num%5 == 0 && num%7 == 0) {
				break;
			}
			
		}
		
		System.out.println("5와 7의 최소공배수 : " + num);
		
		
		
		// continue
		int total = 0;
		
		for(int j = 1; j<=10; j++) {
			if(j % 2 == 1){
				continue;					// continue는 break와 다르게 연산을 멈추는 것이 아니라 무시하고 다음 연산으로 넘긴다.
											// 반복문 상위로 이동
			}
			
			total += j;

		}
		
		System.out.println("1부터 10까지 짝수합 : " + total);
		
	}
}
