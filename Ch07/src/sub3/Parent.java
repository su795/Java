package sub3;

public class Parent extends GrandParent {
	
	// Override 덮어쓰기   -  자식요소에서 부모요소와 같은 메서드를 덮어쓰기해서 사용한다.
	final public void method1() {				// final 선언을 하면 자식 요소에 더이상 Override 할 수 없다
		System.out.println("Parent - method1...");
	}
	
	// Overloading
	public void method2(int a) {
		System.out.println("Parent - method2...");
	}
	
	@Override
	public void method3() {
		System.out.println("Parent - method3...");
	}
}
