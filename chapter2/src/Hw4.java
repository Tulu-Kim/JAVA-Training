
//�������� 3���� ���ڸ� �Է¹޾� ����ū�� �߰�ū�� ������������ ��µǰ� ���α׷����϶�//
import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�");
		int num2 = sc.nextInt();
		
		System.out.print("����° ���ڸ� �Է��Ͻÿ�");
		int num3 = sc.nextInt();

		if (num1 > num2 && num2 > num3)
			System.out.printf(" %d > %d > %d", num1, num2, num3);
		else if (num1 > num3 && num3 > num2)
			System.out.printf(" %d > %d > %d", num1, num3, num2);
		else if (num2 > num1 && num1 > num3)
			System.out.printf(" %d > %d > %d", num2, num1, num3);
		else if (num2 > num3 && num3 > num1)
			System.out.printf(" %d > %d > %d", num2, num3, num1);
		else if (num3 > num1 && num1 > num2)
			System.out.printf(" %d > %d > %d", num3, num1, num2);
		else if (num3 > num2 && num2 > num1)
			System.out.printf(" %d > %d > %d", num3, num2, num1);
		else if (num1 > num2 && num2 == num3)
			System.out.printf(" %d > %d = %d", num1, num2, num3);
		else if (num2 > num1 && num1 == num3)
			System.out.printf(" %d > %d = %d", num2, num1, num3);
		else if (num3 > num2 && num1 == num2)
			System.out.printf(" %d > %d = %d", num3, num1, num2);
		else
			System.out.printf(" %d = %d = %d", num1, num2, num3);
		sc.close();
	}

}
