package sub3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2020/05/21
 * 이름 : 권기민
 * 내용 : 프로퍼티 컬렉션 실습하기 교재 p748
 */

public class ReaderTest {
	
	public static void main(String[] args) {
	
		 String file = "C:\\Users\\bigdata\\Desktop\\Workspace\\file\\sample.txt";
		

		try {
//			FileInputStream file = new FileInputStream("C:\\Users\\bigdata\\Desktop\\sample.txt");
//			InputStreamReader isr= new InputStreamReader(file, "MS949");
//			BufferedReader br = new BufferedReader(isr);
			
//			FileInputStream file = new FileInputStream("C:\\\\Users\\\\bigdata\\\\Desktop\\\\sample.txt");
//	        InputStreamReader isr = new InputStreamReader(file,"UTF-8");
//	        BufferedReader br = new BufferedReader(isr);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
	                new FileInputStream(file), "euc-kr"));
			
			int value = 0;
			
			while(true) {
				
				value = br.read();
				
				if(value == -1) {
					
					break;
				}
			}
			
			char c = (char) value;
			System.out.print(c);
			
			// 스트림 해제
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
