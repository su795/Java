package test09;

/*
 * 날짜 : 2020/05/14
 * 이름 : 권기민
 * 내용 : 추상 클래스, 다형성 연습문제
 */

public class JavaTest9 {
	
	public static void main(String[] args) {
		
		JavaTest9 here = new JavaTest9();
				
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.paint(circle);
		here.paint(triangle);
		
	}
	
	public void paint(Shape obj) {
		obj.draw();
	}
}
