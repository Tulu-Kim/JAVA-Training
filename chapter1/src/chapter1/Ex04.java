package chapter1;
//소스코드 수정하기(키보드로 값을 입력받음//
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] ar) {
		int a,b;
		int result;
		Scanner s =new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오");
		a=s.nextInt();
		System.out.println("두번째 수를 입력하시오");
		b=s.nextInt();//다음으로 입력되는 값을 정수형으로 리턴함.
		result=a+b;
		System.out.println(a+"+"+b+"="+result);
		result=a-b;
		System.out.println(a+"-"+b+"="+result);
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		result=a/b;
		System.out.println(a+"/"+b+"="+result);
	}
}
