
//����̺� �˻��� ���� ����
import java.sql.*;

public class Ex01 {
	public static void main(String[] ar) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// ã��
			System.out.println("�˻�����");

		} catch (ClassNotFoundException e) {
			System.out.println("error=�˻�����");
		}

		// �۾���ü�� ����
		Connection ora_con = null;// ���ᰴü ����
		Statement ora_stmt = null;// ���������� �����Ҷ� ���̴� ��ü
		PreparedStatement ora_pstmt = null;// ���������� �����Ҷ� ���̴� ��ü
		ResultSet rs = null;//���� ������� ��Ƴ��� ��ü ����
		
		try {
			String user = "scott";
			String pw = "1234";
			String url = "jdbc:oracle:thin:@localhost:1521:BTDB";
			ora_con = DriverManager.getConnection(url, user, pw);

			System.out.println("Oracle DB �����");
			ora_stmt = ora_con.createStatement();
			ora_pstmt = ora_con.prepareStatement("select * from dept");

			System.out.println("ora_stmt=" + ora_stmt);
			System.out.println("ora_pstmt=" + ora_pstmt);
			// ����ȯ����� �Ϸ�� ������

			ora_pstmt.close();
			ora_stmt.close();
			ora_con.close();
			System.out.println("����ȯ�� ���˿Ϸ�");

		} catch (SQLException e) {
			System.out.println("error=���ᰴü ����� ����");
		}
	}

}
