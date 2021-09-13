//���������� ���������� ���� ����
import java.sql.*;
import java.util.*;

import javax.print.attribute.ResolutionSyntax;

public class Ex03 {
	public static void main(String[] ar) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// ã��
			System.out.println("�˻�����");
		}catch(ClassNotFoundException e) {
			System.out.println("error="+e);
		}
		//���ᰴü, �۾���ü(����/����)
		Connection conn=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		int deptno=04;
		String dname="abc";
		String loc="Seoul1";
		//String query="insert into dept values('"+deptno+"','"+dname+"','"+loc+"')"; // ����
		String query="insert into dept values(?,?,?)";
		
		
		try {
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BTDB","scott","1234");
		System.out.println("DB���Ἲ��");
		//�����͸� ����־��
		//stmt=conn.createStatement(); //����
		//stmt.executeUpdate(query);  //����
		pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, deptno);
		pstmt.setString(2, dname);
		pstmt.setString(3, loc);///?������ ������ �׸��� ������
		pstmt.executeUpdate();//���� ������Ʈ�� ���
		
		pstmt.close();
		stmt.close();
		conn.close();
		System.out.println("����������Ʈ ��� ����");
		}catch(SQLException e) {
			System.out.println("error="+e);
		}
	}
}
