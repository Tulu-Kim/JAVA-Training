//정적쿼리와 동적쿼리에 대한 예제
import java.sql.*;
import java.util.*;

import javax.print.attribute.ResolutionSyntax;

public class Ex03 {
	public static void main(String[] ar) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 찾기
			System.out.println("검색성공");
		}catch(ClassNotFoundException e) {
			System.out.println("error="+e);
		}
		//연결객체, 작업객체(정적/동적)
		Connection conn=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		int deptno=04;
		String dname="abc";
		String loc="Seoul1";
		//String query="insert into dept values('"+deptno+"','"+dname+"','"+loc+"')"; // 정적
		String query="insert into dept values(?,?,?)";
		
		
		try {
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BTDB","scott","1234");
		System.out.println("DB연결성공");
		//데이터를 집어넣어보자
		//stmt=conn.createStatement(); //정적
		//stmt.executeUpdate(query);  //정적
		pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, deptno);
		pstmt.setString(2, dname);
		pstmt.setString(3, loc);///?에대한 순서와 항목을 정해줌
		pstmt.executeUpdate();//동적 업데이트의 방법
		
		pstmt.close();
		stmt.close();
		conn.close();
		System.out.println("정적업데이트 방법 성공");
		}catch(SQLException e) {
			System.out.println("error="+e);
		}
	}
}
