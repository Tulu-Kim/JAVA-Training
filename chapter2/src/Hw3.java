//�ΰ��� ���ڸ� �Է¹޾� ������if�� �̿��Ͽ� ū���� �������� ��Ÿ����//
import java.util.Scanner;
public class Hw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�");
		int num2 = sc.nextInt();
		
		if(num1 > num2) 
				System.out.printf("ū�� : %d, ������ : %d ",num1,num2);
			else if(num1 < num2)
				System.out.printf("ū�� : %d, ������ : %d ",num2,num1);
			else
				System.out.println("�μ��� �����ϴ�.");
		sc.close();
	}

}
