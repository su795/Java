package p383p384;

public class Test2 {

	public static void main(String[] args) {
		
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				
			}
		};
		
		ci2.method1();
		ci2.method2();	// ChildInterface2¿« method2() »£√‚
		ci2.method3();
	}
}
