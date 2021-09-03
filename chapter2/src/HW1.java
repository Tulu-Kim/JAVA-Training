//8.27 문제풀기, 정수형 숫자1개를 입력받아 이를 10진수 16진수 8진수로 출력하는 플그램을 작성하라.
import java.util.Scanner;
public class HW1 {
	public static void main(String[] ar) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오");
		a=sc.nextInt();
		System.out.printf("10진수 : %d \n",a);
		System.out.printf("16진수 : %x \n",a);
		System.out.printf("8진수 : %ㅇ",a);
		sc.close();
	}
}
