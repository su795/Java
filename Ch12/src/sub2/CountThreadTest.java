package sub2;

/*
 * 날짜 : 2020/05/19
 * 이름 : 권기민
 * 내용 : 스레드(Thread) 활용 실습하기 교재 p576
*/ 

public class CountThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		// run(); main() 메서드에서 싱글스레드로 작업하는 Thread 내장 메서드. 같은 메서드를 쓸경우 차례차례 메서드를 사용하고 이동
		// start(); 서브스레드를 거쳐서 병렬로 같은 메서드를 공유해서 사용하는 Thread 내장 메서드
		// start() 메서드를 그냥 사용할 경우 병렬작업을 진행할 때 메서드 연산이 누락된다.
		// start()로 각각 setNum() 메서드를 돌리면 num++의 +1연산이 ct1과 ct2에서 동시에 일어난다면 +2가 되는 것이 아니라 하나의 연산이 누락된다.
		// 그래서 run()으로 실행할 때는  결과값이 3000이지만 start()로 실행할 때는 3000이 되지 않는 경우가 발생한다.
		// 연산 메서드에 synchronized를 추가하면 병렬작업으로 인한 누락현상을 방지할 수 있다.
		ct1.start();
		ct2.start();
		ct3.start();
		
		// 메인스레드에서 파생된 서브스레드의 작업이 완료된 후 다시 메인스레드로 합류되는 것을 실행
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("결과 : " + count.getNum());
	}
	
}
