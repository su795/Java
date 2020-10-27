package sub2;

/*
 * 날짜 : 2020/05/18
 * 이름 : 권기민
 * 내용 : String 멤버 실습하기 교재 p496
 */

public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
		// length
		System.out.println("str 문자열 길이 : " + str.length());
		
		
		// charAt
		System.out.println("str의 7번째 문자 : " + str.charAt(6));
		
		
		// substring
		System.out.println("str의 0번에서 4번까지의 문자열 : " + str.substring(0, 5));
		System.out.println("str의 6번에서 마지막까지의 문자열 : " + str.substring(6));
		
		
		// indexOf, lastIndexOf
		int idx1 = str.indexOf("e");		// 문자열 앞에서부터 찾음
		int idx2 = str.lastIndexOf("e");	// 문자열 뒤에서부터 찾음
		
		System.out.println("문자열 str에서 앞에서부터 찾은 문자 e의 인덱스 값 : " + idx1);
		System.out.println("문자열 str에서 뒤에서부터 찾은 문자 e의 인덱스 값 : " + idx2);
		
		
		// replace - 문자열 교체
		String newStr = str.replace("Korea", "Busan");
		System.out.println("newStr : " + newStr);
		
				
		// valueOf
		int 	var1 = 1;
		double  var2 = 2.13;
		boolean var3 = true;
		boolean var4 = false;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = String.valueOf(var3);
		String s4 = "" + var4;
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
	}
}
