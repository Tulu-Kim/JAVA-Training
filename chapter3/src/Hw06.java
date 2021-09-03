//Scanner를 이용하여 정수를 입력받고 (별표)가 정수갯수만큼에서 감소되는
//방향으로 출력되는 프로그램을 작성
import java.util.Scanner;
public class Hw06 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int i=0,j=0;
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		for(i=num;0<i;i--) {
			for(j=i;0<j;j--) {
				System.out.print("★");
			}
			System.out.println();
		}
	sc.close();
	}

}

