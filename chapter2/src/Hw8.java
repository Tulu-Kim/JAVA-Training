//�������ڸ�(10~99)�� �Է¹ް� ���� �ڸ��� 1�� �ڸ��� ������ �Ǻ��Ͽ� ���//
import java.util.Scanner;
public class Hw8 {
	public static void main (String[] ar) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� ���ڸ��� �Է��ϼ���(10~99)");
		int num=sc.nextInt();
		
		if(num>=10&&num<=99) {
		if(num/10==num%10)
		 System.out.println("�����ڸ��� �����ڸ��� �����ϴ�.");
		else
		 System.out.println("�����ڸ��� �����ڸ��� �ٸ��ϴ�.");
		 sc.close();}
		else
		 System.out.println("1~99�� ���ڸ� �Է����ֽʽÿ�.");

}
}