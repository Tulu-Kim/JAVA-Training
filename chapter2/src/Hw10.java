//1~99까지의 정수를 입력받아 369게임을 한다. 하나가 이는경우 "박수찍"
//두개가 있는경우는 "박수짝짝"을 출력 
import java.util.Scanner;
public class Hw10 {
	public static void main(String[] ar) {
	Scanner sc=new Scanner(System.in);
    
    System.out.println("1~99까지의 숫자를 입력하시오");
    int num=sc.nextInt();
    int num10,num1;
    num10=num/10;
    num1=num%10;
    if(num1==3||num1==6||num1==9) {
       if(num10==3||num10==6||num10==9)
    	    System.out.println("박수짝짝");
       else
    	   System.out.println("박수짝");
    
   }
    sc.close();
}
}