import java.util.Scanner;
public class Hw05_3_7 {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		int [] x=new int[5];//�迭�� ����Ͽ� �Ѳ����� ����
		int max=0;
		System.out.println("��� 5�� �Է�");

		for(int i=0;i<5;i++) {
			x[i] = sc.nextInt();
			if(x[i]>max) 
				max = x[i];

		}
		System.out.print("���� ū ����" + max + "�Դϴ�.");

		}
	}



