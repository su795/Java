package sub2;

public class Product<A, B> {

	private A item;
	private B info;
	
	public Product(A item, B info) {
		this.item = item;
		this.info = info;
	}
	
	public void show() {
		System.out.println("제품 종류 : "+item);
		System.out.println("제품 정보 : "+info);
	}
}
