//����ó�������� ����,�ý��ۼ����� �ø��� �߿��� ���̴�����//
//�μ��� �Է¹޾� �������� �����Ѵ�. ����ó��//
import java.util.Scanner;
import java.util.*;
public class Ex19 {
	public static void main(String[] ar) {
		int su1=0,su2=0,result=0;
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("su1=");
		su1=sc.nextInt();
		
		System.out.print("su2=");
		su2=sc.nextInt();
		
		System.out.print("");
		System.out.println("su1"+su1+'\t'+"su2"+su2);
		
		result=su1/su2;
		System.out.println("�����"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("�������� 0�� ����� �� �����");
		}
		catch(InputMismatchException e) {
			System.out.println("���������� �߸��Ǿ��ֽ��ϴ�.");
		}
	finally{}
	
	}
	
}		
		
	
