package p383p384;

public interface ParentInterface {

	public void method1();
	public default void method2() {
		System.out.println("부모인터페이스");
	}
}
