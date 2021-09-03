package chapter1;
//숫자4개를 입력받아서 그 합을 구하는 프로그램//
import java.util.Scanner;
public class HW1 {
	public static void main(String[] ar) {
		int a,b,c,d;
		int result;
		Scanner s =new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오");
		a=s.nextInt();
		System.out.println("두번째 수를 입력하시오");
		b=s.nextInt();//다음으로 입력되는 값을 정수형으로 리턴함.
		System.out.println("세번째 수를 입력하시오");
		c=s.nextInt();
		System.out.println("네번째 수를 입력하시오");
		d=s.nextInt();
		result=a+b+c+d;
		System.out.println(a+"+"+b+"+"+c+"+"+d+"="+result);

}
}

