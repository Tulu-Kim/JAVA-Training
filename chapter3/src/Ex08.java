//do~while
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] ar) {
		Scanner s=new Scanner(System.in);
		int kor=0,eng=0,math=0,tot=0;
		float avg=0;
		
		do {
		System.out.print("ko=");
		kor=s.nextInt();
		}while(kor<0||kor>100);//다시 수행하는 조건
		
		do {
		System.out.print("eng=");
		eng=s.nextInt();
		}while(eng<0||eng>100);
		
		do {
		System.out.print("math=");
		math=s.nextInt();
		}while(eng<0||eng>100);
		
		tot=kor+eng+math;
		avg=tot/3;
		
		System.out.println("tot"+tot+'\t'+"avg"+avg);
		
	}

}
