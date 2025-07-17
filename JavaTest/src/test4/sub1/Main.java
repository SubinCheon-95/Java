package test4.sub1;

/*
 * 날짜 : 2025/07/17
 * 이름 : 천수빈
 * 내용 : 자바 클래스 문제
 */
public class Main {

	public static void main(String[] args) {
		
		// 학생 성적 객체 생성
		StudentScore student = new StudentScore("홍길동", "S001", "자바", 90.0);
		
		// 학생 정보 출력
		student.printStudentInfo();
		System.out.println("---------------------");
		
		// 성적 수정 및 조회 테스트
		student.updateScore(98.0);
		System.out.println("---------------------");
		
		// 유효하지 않은 성적 입력
		student.updateScore(102.0);
		System.out.println("---------------------");
		
		// 학생 정보 출력
		student.printStudentInfo();
		System.out.println("---------------------");
	}
}
