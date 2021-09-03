import java.util.Scanner;
public class Hw05_3_7 {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		int [] x=new int[5];//배열을 사용하여 한꺼번에 선헌
		int max=0;
		System.out.println("양수 5개 입력");

		for(int i=0;i<5;i++) {
			x[i] = sc.nextInt();
			if(x[i]>max) 
				max = x[i];

		}
		System.out.print("가장 큰 수는" + max + "입니다.");

		}
	}



