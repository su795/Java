package sub3;

public class Calc {

	// 싱글톤 객체
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}		// 외부에서 Calc 클래스로 객체(인스턴스) 생성을 못하도록 막음.
	
	public int plus(int x, int y) {
		
		int z = x + y;
		
		return z;
	}
	
	public int minus(int x, int y) {
		
		int z = x - y;
		
		return z;
	}
	
	public int multi(int x, int y) {
		
		int z = x * y;
		
		return z;
	}
	
//	public int div(int x, int y) {
//		
//		int z = 0;
//		
//		try {			
//			z =  x / y;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return z;
//	}
		
	// div 메서드는 에러가 발생할 수 있다는 가능성을 throws 선언을 통해 호출하는 쪽에 알림
	public int div(int x, int y) throws Exception {
		
		if(y<=1) {
			
			// 정석
			// 에러가 발생할때 메서드를 호출하는 쪽으로 에러를 던진다.
//			Exception e = new Exception("y가 1이하 입니다.");
//			throw e;
			
			// 약식
			throw new Exception("y가 1이하 입니다.");
		}
		
		if(y<0) {
			throw new Exception("y는 양수여야 합니다.");
		}else if(y==1) {
			Exception e = new Exception("y가 1이 되면 안됩니다.");
			throw e;
		}
		
		int z =  x / y;
			
			return z;
	}
	
	
}
