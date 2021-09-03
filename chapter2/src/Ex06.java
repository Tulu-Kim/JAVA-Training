//if조건절에 대한 예제
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("점수를 입력하시오");
		int score = sc.nextInt();
		sc.close();
		if(score>80) {
			System.out.println("합격하셨습니다.");
		}
	}
	
}
