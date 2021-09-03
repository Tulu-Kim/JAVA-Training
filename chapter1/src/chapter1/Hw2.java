package chapter1;
import java.util.Scanner;
public class Hw2 {
	public static void main(String ar[]) {
		int  a,b;
		int f;
		int result;
		Scanner s =new Scanner(System.in);
		System.out.println("실행할 사직연산 기호[+(1),-(2),*(3),/(4)]를 입력하시오");
		f=s.nextInt();
		System.out.println("첫번째수를 입력하시오");
		a=s.nextInt();
		System.out.println("두번째수를 입력하시오");
		b=s.nextInt();
		if (b!=0){	
		if (f==1){
			result=a+b;
			System.out.println(a+"+"+b+"="+result);
		}
		else if(f==2) {
			result=a+b;
			System.out.println(a+"-"+b+"="+result);
		}
		else if(f==3) {
			result=a*b;
			System.out.println(a+"*"+b+"="+result);
		}
		else if(f==4) {
		System.out.println(a+"/"+b+"="+((double)a/b));
		}
	    }
		else if(b==0){
			System.out.println("나눗셈을 실행할수 없습니다. 두번째값은 0 이외의 값으로 입력해 주십시요,");
		}
	}
}
