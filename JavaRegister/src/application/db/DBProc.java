package application.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBProc {

	// DB 정보
	private final String HOST = "jdbc:mysql://192.168.44.7:3306/kkm";
	private final String USER = "kkm";
	private final String PASS = "1234";
	
	// 싱글톤 객체
	public static DBProc instance = new DBProc();
	
	public static DBProc getInstance() {
		return instance;
	}
	private DBProc() {}
	
	
	
	public void insertUser1(String uid, String name, String hp, String pos, int dep) throws Exception {
		// 1단계
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계
		Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		
		if(conn != null) {
			System.out.println("데이터베이스 접속 성공!");
		}
		
		// 3단계
		Statement stmt = conn.createStatement();		
		
		// 4단계
		String sql = "INSERT INTO `MEMBER` VALUES ('"+uid+"', '"+name+"', '"+hp+"', '"+pos+"', "+dep+", NOW())";
		stmt.executeUpdate(sql);
		
		// 5단계
		
		// 6단계
		stmt.close();
		conn.close();
		
		System.out.println("INSERT1 완료...");
	}
	
	public void insertUser2(String uid, String name, String hp, String pos, int dep) throws Exception {
		// 1단계
				Class.forName("com.mysql.jdbc.Driver");
				
				// 2단계
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
				
				if(conn != null) {
					System.out.println("데이터베이스 접속 성공!");
				}
				
				// 3단계
				String sql = "INSERT INTO `MEMBER` VALUES (?, ?, ?, ?, ?, NOW())";
				PreparedStatement psmt = conn.prepareStatement(sql);		
				psmt.setString(1, uid);
				psmt.setString(2, name);
				psmt.setString(3, hp);
				psmt.setString(4, pos);
				psmt.setInt(5, dep);
				// 4단계
				
				psmt.executeUpdate();
				
				// 5단계
				
				// 6단계
				psmt.close();
				conn.close();
				
				System.out.println("INSERT2 완료...");
	}
}
