//���� �迭�Ҵ�(�ܺ��� �Է����� �ʱ�ȭ�ϴ°�)�� �Ϸ� �ʱ�ȭ�ϴ� ���//

import java.util.Scanner;
public class Ex16 {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		
		int [] x =null;
		int num=0;
		
		System.out.print("num=");
		num=sc.nextInt();
		x=new int[num];
		
		for(int i=0;i<x.length;i++) {
			System.out.println("x["+i+"]="+x[i]);
		}
		
}
}