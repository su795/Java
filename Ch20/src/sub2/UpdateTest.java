package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2020/05/26
 * 이름 : 권기민
 * 내용 : JDBC Update 실습하기
 */

public class UpdateTest {
	
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://192.168.44.7:3306/kkm";
		String user = "kkm";
		String pass = "1234";
		
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!");
			}
			
			// 3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "UPDATE `USER1` SET `uid`='G107' ";
				   sql += "WHERE `name`='류성룡'";
			stmt.executeUpdate(sql);
			
			// 5단계 - 결과셋 처리(SELECT문일 경우만 해당)			
			// 6단계 - 데이터베이스 종료
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("드라이버 로드에 실패했습니다.");
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("데이터베이스 접속에 문제가 발생했습니다.");
		}
	}
}
