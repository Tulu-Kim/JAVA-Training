import java.util.Scanner;

public class Hw06_3_8 {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		int [] x=new int[5];//�迭�� ����Ͽ� �Ѳ����� ����
		int sum=0;
		
		System.out.println(x.length+"���� ������ �Է��ϼ���>>");
		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextInt();
		}
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
		}
		System.out.print("�����" +(double)sum/x.length);
		sc.close();
		}
}
