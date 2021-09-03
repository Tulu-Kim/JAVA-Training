import java.util.Scanner;

public class Hw06_3_8 {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		int [] x=new int[5];//배열을 사용하여 한꺼번에 선헌
		int sum=0;
		
		System.out.println(x.length+"개의 정수를 입력하세요>>");
		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextInt();
		}
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
		}
		System.out.print("평균은" +(double)sum/x.length);
		sc.close();
		}
}
