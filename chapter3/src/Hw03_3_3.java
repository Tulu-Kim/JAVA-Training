
import java.util.Scanner;
public class Hw03_3_3 {
	public static void main(String[] ar) {
		Scanner s=new Scanner(System.in);
		System.out.print("���ϴ� �������� �ܼ��� �Է��϶�.");
		int a=s.nextInt();
		for(int j=1;j<=a;j++) {
			for(int i=1;i<10;i++) {
				System.out.print(j+"*"+i+"="+j*i);
				System.out.print('\t');
		}
		System.out.println();
	}
		s.close();

	}
}