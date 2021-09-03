//정수두자리(10~99)를 입력받고 십의 자리와 1의 자리가 같으닞 판별하여 출력//
import java.util.Scanner;
public class Hw8 {
	public static void main (String[] ar) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 두자리를 입력하세요(10~99)");
		int num=sc.nextInt();
		
		if(num>=10&&num<=99) {
		if(num/10==num%10)
		 System.out.println("십의자리와 일의자리가 같습니다.");
		else
		 System.out.println("십의자리와 일의자리가 다릅니다.");
		 sc.close();}
		else
		 System.out.println("1~99의 숫자를 입력해주십시오.");

}
}