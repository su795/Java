package sub1;

public class Apple {

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
	}
	
	
	@Override			// Object 클래스에서 정의되어 있는 메서드기 때문에 Override됨.
	public String toString() {
		
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
		return super.toString();
	}
}
