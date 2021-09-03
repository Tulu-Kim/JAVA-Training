//Scanner class의 사용
import java.io.*;
import java.util.*;

public class Ex06 {
	public static void main(String [] ar)throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열=");
		String str=sc.next();
		
		System.out.print("숫자는=");
		int x=  sc.nextInt();
		
		System.out.println("더블숫자는=");
		double y=sc.nextDouble();
		
	// BufferedReader 같은 긴 , 숫자형 변형을 안해도 자연스럽게 데이터를 입력할수 있음
		System.out.println("str="+str);
		System.out.println("x="+x);
		System.out.println("y="+y);
	 sc.close();
	}
}