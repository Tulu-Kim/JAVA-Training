
//입력된 연도가 윤년인경우 윤년인지 표시해라, 4로 나뉘어 떨어지고 100으로는 나누어 떨어지지 않는다.//
//400으로 나누어 떨어진다.//
import java.util.Scanner;

public class Hw5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("년도를 입력하세요.");
		int y = sc.nextInt();

		if ((y%4==0 && y%100!=0)||(y%400==0)) 
			System.out.printf(" %d년은 윤년입니다.", y);
		    else 
			System.out.printf(" %d년은 평년입니다.", y);
	
		sc.close();
	
	}
}