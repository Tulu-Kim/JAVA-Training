
//�Էµ� ������ �����ΰ�� �������� ǥ���ض�, 4�� ������ �������� 100���δ� ������ �������� �ʴ´�.//
//400���� ������ ��������.//
import java.util.Scanner;

public class Hw5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�⵵�� �Է��ϼ���.");
		int y = sc.nextInt();

		if ((y%4==0 && y%100!=0)||(y%400==0)) 
			System.out.printf(" %d���� �����Դϴ�.", y);
		    else 
			System.out.printf(" %d���� ����Դϴ�.", y);
	
		sc.close();
	
	}
}