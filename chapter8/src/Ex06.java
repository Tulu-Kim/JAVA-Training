//Scanner class�� ���
import java.io.*;
import java.util.*;

public class Ex06 {
	public static void main(String [] ar)throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ�=");
		String str=sc.next();
		
		System.out.print("���ڴ�=");
		int x=  sc.nextInt();
		
		System.out.println("������ڴ�=");
		double y=sc.nextDouble();
		
	// BufferedReader ���� �� , ������ ������ ���ص� �ڿ������� �����͸� �Է��Ҽ� ����
		System.out.println("str="+str);
		System.out.println("x="+x);
		System.out.println("y="+y);
	 sc.close();
	}
}