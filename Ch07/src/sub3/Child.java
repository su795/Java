package sub3;

public class Child extends Parent {

	// Override X 부모요소(Parent)에 final을 선언하여 Override를 막아놨으므로 오류가 남.
//	public void method1() {
//		System.out.println("Child - method1...");
//	}
	
	@Override
	public void method2() {
		System.out.println("Child - method2...");
	}
	
	// Overloading
	public void method3(int a) {
		System.out.println("Child - method3...");
	}
}
