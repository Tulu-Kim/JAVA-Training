//Scanner�� �̿��Ͽ� ������ �Է¹ް� (��ǥ)�� ����������ŭ���� ���ҵǴ�
//�������� ��µǴ� ���α׷��� �ۼ�
import java.util.Scanner;
public class Hw06 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int i=0,j=0;
		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt();
		for(i=num;0<i;i--) {
			for(j=i;0<j;j--) {
				System.out.print("��");
			}
			System.out.println();
		}
	sc.close();
	}

}

