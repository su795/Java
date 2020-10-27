package p383p384;

public interface ChildInterface2 extends ParentInterface {

	@Override
	public default void method2() {
		 System.out.println("자식2인터페이스");
	} 	// 재정의
	
	public void method3();
	
	
	
	
}
