//배열 for 
//3개의 값을 입력받아 출력
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] ar) {
		
		int [] x=new int[3];//배열을 사용하여 한꺼번에 선헌
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
