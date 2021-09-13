//간단한 Select 예제. 가지고 와서 출력
import java.sql.*;


public class Ex02 {
	public static void main(String [] ar) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("검색 success");
		
		}catch(ClassNotFoundException e) {
			System.out.println("error="+e);
		}
		//Connection 객체, 작업객체를 정의하자
		Connection conn=null;
		Statement stmt = null;//작업객체를 정의
		ResultSet rs=null;//결과물을 담아놓는 객체
		
		String url="jdbc:oracle:thin:@localhost:1521:BTDB";
		String id="scott";
		String pw="1234";
		String query="select * from dept";
		
		try {
			conn=DriverManager.getConnection(url,id,pw);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);
			
			System.out.println("DEPTNO \t DNAME \t LOC");
			
			while(rs.next()) {
				int deptno=rs.getInt(1);//1은 첫번째 칼럼을 뜻, rs.getInt("deptno")
				String dname=rs.getString(2);//rs.getInt("dname")
				String loc=rs.getString(3);//rs.getInt("loc")
				
				//date 를 뽑아내는 경우에는
				//java.sqp.Date date=rs,getDate();
				//java.util.Date d = new java.util.Date();
				System.out.print(deptno+"\t");
				System.out.print(dname+"\t");
				System.out.println(loc);
			}
		}catch(SQLException e) {
			System.out.println("error sql="+e);
		}
	}
}
