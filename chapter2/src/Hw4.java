
//도전과제 3개의 숫자를 입력받아 가장큰수 중간큰수 가장작은수로 출력되게 프로그래밍하라//
import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하시오");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 숫자를 입력하시오");
		int num3 = sc.nextInt();

		if (num1 > num2 && num2 > num3)
			System.out.printf(" %d > %d > %d", num1, num2, num3);
		else if (num1 > num3 && num3 > num2)
			System.out.printf(" %d > %d > %d", num1, num3, num2);
		else if (num2 > num1 && num1 > num3)
			System.out.printf(" %d > %d > %d", num2, num1, num3);
		else if (num2 > num3 && num3 > num1)
			System.out.printf(" %d > %d > %d", num2, num3, num1);
		else if (num3 > num1 && num1 > num2)
			System.out.printf(" %d > %d > %d", num3, num1, num2);
		else if (num3 > num2 && num2 > num1)
			System.out.printf(" %d > %d > %d", num3, num2, num1);
		else if (num1 > num2 && num2 == num3)
			System.out.printf(" %d > %d = %d", num1, num2, num3);
		else if (num2 > num1 && num1 == num3)
			System.out.printf(" %d > %d = %d", num2, num1, num3);
		else if (num3 > num2 && num1 == num2)
			System.out.printf(" %d > %d = %d", num3, num1, num2);
		else
			System.out.printf(" %d = %d = %d", num1, num2, num3);
		sc.close();
	}

}
