//�迭 for 
//3���� ���� �Է¹޾� ���
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] ar) {
		
		int [] x=new int[3];//�迭�� ����Ͽ� �Ѳ����� ����
		Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<x.length;i++) {
			System.out.print(i+"=");
			x[i] = sc.nextInt();
			
		}
		
		
		
		System.out.println();
		for(int i=0;i<x.length;i++) {
			System.out.println(i+":"+x[i]);
		
		}
	}
}
