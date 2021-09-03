//두개의 숫자를 입력받아 조건절if를 이용하여 큰수와 작은수를 나타내라//
import java.util.Scanner;
public class Hw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오");
		int num2 = sc.nextInt();
		
		if(num1 > num2) 
				System.out.printf("큰수 : %d, 작은수 : %d ",num1,num2);
			else if(num1 < num2)
				System.out.printf("큰수 : %d, 작은수 : %d ",num2,num1);
			else
				System.out.println("두수가 같습니다.");
		sc.close();
	}

}
