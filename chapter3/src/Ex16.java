//동적 배열할당(외부의 입력으로 초기화하는것)을 하려 초기화하는 방법//

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