
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] ar) {
		char grade;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("점수를 입력하시오 (0~100)");
		int score = sc.nextInt();
		sc.close();
		if(score>=90) 
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'c';
		else if(score>=70)
			grade = 'D';
		else 
			grade = 'F';
		System.out.println("학점은 "+grade+"입니다.");	
		sc.close();
	}
	
}
