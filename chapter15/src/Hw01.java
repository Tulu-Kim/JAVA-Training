
//1. JDBC�� �̿��Ͽ� ����ŬDB�� �����Ͽ� �л����̺�� ������̺��� �˻��Ͽ� �������ÿ�

import java.sql.*;


public class Hw01 {
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
		String query1="select * from student";
		String query2="select * from emp";
		
		try {
			conn=DriverManager.getConnection(url,id,pw);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query1);
			
			System.out.println("STU_NO \t STU_NAME \t STU_DEPT \t STU_GRADE \t STU_CLASS \t STU_GENDER \t STU_HEIGHT \t STU_WEIGHT");
			
			while(rs.next()) {
				String STU_NO=rs.getString(1);
				String STU_NAME=rs.getString(2);
				String STU_DEPT=rs.getString(3);
				int STU_GRADE=rs.getInt(4);
				String STU_CLASS=rs.getString(5);
				String STU_GENDER=rs.getString(6);
				double STU_HEIGHT = rs.getDouble(7);
				double STU_WEIGHT = rs.getDouble(8);

				//date �� �̾Ƴ��� ��쿡��
				//java.sqp.Date date=rs,getDate();
				//java.util.Date d = new java.util.Date();
				System.out.print(STU_NO+"\t");
				System.out.print(STU_NAME+"\t");
				System.out.print(STU_DEPT+"\t\t");
				System.out.print(STU_GRADE+"\t");
				System.out.print(STU_CLASS+"\t");
				System.out.print(STU_GENDER+"\t");
				System.out.print(STU_HEIGHT+"\t");
				System.out.println(STU_WEIGHT);
				
			}
			rs=stmt.executeQuery(query2);
			System.out.println("EMPNO \t ENAME \t JOB \t MGR \t HIREDATE \t SAL \t COMM \t DEPTNO");

			while(rs.next()) {
				int EMPNO = rs.getInt(1);
				String ENAME = rs.getString(2);
				String JOB = rs.getString(3);
				int MGR = rs.getInt(4);
				Date HIREDATE = rs.getDate(5);
				double SAL = rs.getDouble(6);
				double COMM  = rs.getDouble(7);
				int DEPTNO = rs.getInt(8);

				System.out.printf(EMPNO+"\t");
				System.out.printf(ENAME+"\t");
				System.out.printf(JOB+"\t");
				System.out.printf(MGR+"\t");
				System.out.print(HIREDATE+"\t");
				System.out.print(SAL+"\t");
				System.out.print(COMM+"\t");
				System.out.println(DEPTNO);
			}
			rs.close();
			stmt.close();
			conn.close();

		}catch(SQLException e) {
			System.out.println("error sql="+e);
		}
	}
}
