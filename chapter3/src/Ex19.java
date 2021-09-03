//예외처리에대한 예제,시스템성능을 올릴때 중요한 데이더가됨//
//두수를 입력받아 나눗셈을 수행한다. 예외처리//
import java.util.Scanner;
import java.util.*;
public class Ex19 {
	public static void main(String[] ar) {
		int su1=0,su2=0,result=0;
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("su1=");
		su1=sc.nextInt();
		
		System.out.print("su2=");
		su2=sc.nextInt();
		
		System.out.print("");
		System.out.println("su1"+su1+'\t'+"su2"+su2);
		
		result=su1/su2;
		System.out.println("결과는"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("나눗셈은 0을 사용할 수 없어요");
		}
		catch(InputMismatchException e) {
			System.out.println("숫자포맷이 잘못되어있습니다.");
		}
	finally{}
	
	}
	
}		
		
	
