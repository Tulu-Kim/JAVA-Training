import java.util.Scanner;

public class Hw05_3_15 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("�������� �Է��Ͻÿ�:");
			int dividend=sc.nextInt();
			System.out.print("���T���� �Է��Ͻÿ�:");
			int divisor=sc.nextInt();
			try {
				System.out.println(dividend + "��  "+ divisor +"�� ������ ����"
				+dividend/divisor + "�Դϴ�.");
				break;
			}
			catch (ArithmeticException e){
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
				}
			}
			sc.close();
	}
}
