package p383p384;

public class Test3 {

	public static void main(String[] args) {
		
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method2() {
				System.out.println("자식3인터페이스");
				
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				
			}
		};
		
		ci3.method1();
		ci3.method2();	// ChildInterface2의 method2() 호출
		ci3.method3();
	}
}
