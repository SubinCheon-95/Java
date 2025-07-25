package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025/07/25
 * 이름 : 천수빈
 * 내용 : 자바 PreparedStatement 실습하기
 */
public class PreparedInsertTest {

	public static void main(String[] args) {
		
		
		// DB정보
		final String host = "jdbc:oracle:thin:@localhost:1521:xe";
		final String user = "sub6550";
		final String pass = "1234";
	
		try {
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성(PreparedStatement)
			String sql = "INSERT INTO USER1 VALUES (?,?,?,?)"; // 쿼리 파라미터를 사용한 SQL(준비된 쿼리)
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 각 쿼리 파라미터를 바인딩
			psmt.setString(1, "P101"); 
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1222-3333");
			psmt.setInt(4, 34);
			
			// SQL 실행
			psmt.executeUpdate(); // INSERT, DELETE, UPDATE는 executeUpdate() 실행!!!
			
			// 결과처리(SELECT 일 때)
			
			// 데이터베이스 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
	}	
}
