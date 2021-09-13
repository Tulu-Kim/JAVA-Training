//������ Select ����. ������ �ͼ� ���
import java.sql.*;


public class Ex02 {
	public static void main(String [] ar) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�˻� success");
		
		}catch(ClassNotFoundException e) {
			System.out.println("error="+e);
		}
		//Connection ��ü, �۾���ü�� ��������
		Connection conn=null;
		Statement stmt = null;//�۾���ü�� ����
		ResultSet rs=null;//������� ��Ƴ��� ��ü
		
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
				int deptno=rs.getInt(1);//1�� ù��° Į���� ��, rs.getInt("deptno")
				String dname=rs.getString(2);//rs.getInt("dname")
				String loc=rs.getString(3);//rs.getInt("loc")
				
				//date �� �̾Ƴ��� ��쿡��
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
