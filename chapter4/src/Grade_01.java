import java.util.Scanner;

class Grade{
	int math,  science, englich, sum;
	public Grade(int m ,int s,int e) {
		math=m;
		science=s; 
		englich=e;
	}
	public double average() {	
	sum =(math+science+englich)/3;
	return  sum;
	}
}
public class Grade_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int englich = scanner.nextInt();
		Grade me = new Grade(math,science,englich);
		System.out.println("평균은 "+me.average());
		
		scanner.close();		
	}
}
