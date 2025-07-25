package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1VO;

/*
 * 날짜 : 2025/07/25
 * 이름 : 천수빈
 * 내용 : 자바 PreparedSelect 실습하기
 */
public class PreparedSelectTest {

	public static void main(String[] args) {
		
		// DB정보
		final String host = "jdbc:oracle:thin:@localhost:1521:xe";
		final String user = "sub6550";
		final String pass = "1234";
		
		// 조회 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<>();
		
		try {
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성(PreparedStatement)
			String sql = "SELECT * FROM USER1 WHERE AGE >= ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 20); // 1번째 쿼리 파라미터(?)에 나이 숫자 20 바인딩
			
			// SQL 실행
			ResultSet rs = psmt.executeQuery(); // SELECT 실행하기 때문에 executeQuery()로 실행해야 ResultSet 반환됨
			
			// 결과처리(SELECT 일 때)
			while(rs.next()) {
				
				// VO 객체 생성 : VO 객체는 데이터베이스에서 조회된 결과로 초기화된 읽기 전용 객체
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
			}
			
			// 데이터베이스 종료
			rs.close();
			psmt.close();
			conn.close();
			
			// 리스트 출력
			for(User1VO user1 : users) {
				System.out.println(user1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Select 완료...");
	}
}
