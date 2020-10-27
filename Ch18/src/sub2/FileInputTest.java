package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.IIOException;

/*
 * 날짜 : 2020/05/21
 * 이름 : 권기민
 * 내용 : 자바 파일 입출력 실습하기 교재 p1018
 */

public class FileInputTest {

	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\Workspace\\file\\sample.txt";
		
		try {
			FileInputStream fis = new FileInputStream(file);
			// 변수 생성 및 초기화
			int value = 0;
			
			while(true) {
				
				// 입력스트림 연결
				value = fis.read();
				
				if(value == -1) {
				
					// 더 이상 읽을 데이터가 없을 경우 
					break;
				}
				
				char c = (char) value;	// 숫자형 데이터를 문자형 데이터로 치환
				System.out.print(c);
			}
			
			// 입력스트림 해제
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  // 일일이 에러가 발생할 것 같은 구문마다 catch를 달아 줄 수도 있고 대표 Exception 구문을 써서 하나로 통일 할 수도 있다.
		  // 에러 상황을 하나하나 알아야할 경우 통합 Exception을 쓰지 않는다.
		  // catch (FileNotFoundException e) {
		  // e.printStackTrace();
		  //} catch (IOException e) {
		  // e.printStackTrace();
		  // } 
		
		System.out.println("\n프로그램 종료!!!");
		
		
	}
}
