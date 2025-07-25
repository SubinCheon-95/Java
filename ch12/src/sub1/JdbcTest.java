package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜 : 2025/07/25
 * 이름 : 천수빈
 * 내용 : 자바 JDBC 실습하기
 */
public class JdbcTest {

	public static void main(String[] args) {
		
		// DB정보
		final String host = "jdbc:oracle:thin:@localhost:1521:xe";
		final String user = "sub6550";
		final String pass = "1234";
		
		// 데이터베이스 접속
		try {
			Connection conn = DriverManager.getConnection(host, user,pass);
		
			if(conn != null) {
				System.out.println("접속 성공!");
			}else {
				System.out.println("접속 실패!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
