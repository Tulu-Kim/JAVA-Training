
//드라이브 검색에 대한 예제
import java.sql.*;

public class Ex01 {
	public static void main(String[] ar) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 찾기
			System.out.println("검색성공");

		} catch (ClassNotFoundException e) {
			System.out.println("error=검색오류");
		}

		// 작업객체들 정의
		Connection ora_con = null;// 연결객체 선언
		Statement ora_stmt = null;// 정적쿼리를 진행할때 쓰이는 객체
		PreparedStatement ora_pstmt = null;// 동적쿼리를 진행할때 쓰이는 객체
		ResultSet rs = null;//쿼리 결과물을 담아놓는 객체 내용
		
		try {
			String user = "scott";
			String pw = "1234";
			String url = "jdbc:oracle:thin:@localhost:1521:BTDB";
			ora_con = DriverManager.getConnection(url, user, pw);

			System.out.println("Oracle DB 연결됨");
			ora_stmt = ora_con.createStatement();
			ora_pstmt = ora_con.prepareStatement("select * from dept");

			System.out.println("ora_stmt=" + ora_stmt);
			System.out.println("ora_pstmt=" + ora_pstmt);
			// 구성환경까지 완료된 형태임

			ora_pstmt.close();
			ora_stmt.close();
			ora_con.close();
			System.out.println("구성환경 점검완료");

		} catch (SQLException e) {
			System.out.println("error=연결객체 만들기 오류");
		}
	}

}
