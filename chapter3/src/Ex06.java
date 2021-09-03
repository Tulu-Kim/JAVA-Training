//중첩 for 문, 구구단
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] ar) {
		Scanner s=new Scanner(System.in);
		System.out.print("원하는 구구단의 단수를 입력하라.");
		int a=s.nextInt();
		for(int j=1;j<=a;j++) {
			for(int i=1;i<10;i++) {
				System.out.print(j+"*"+i+"="+j*i);
				System.out.print('\t');
		}
		System.out.println();
	}
}
}