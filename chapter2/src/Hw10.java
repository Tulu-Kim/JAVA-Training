//1~99������ ������ �Է¹޾� 369������ �Ѵ�. �ϳ��� �̴°�� "�ڼ���"
//�ΰ��� �ִ°��� "�ڼ�¦¦"�� ��� 
import java.util.Scanner;
public class Hw10 {
	public static void main(String[] ar) {
	Scanner sc=new Scanner(System.in);
    
    System.out.println("1~99������ ���ڸ� �Է��Ͻÿ�");
    int num=sc.nextInt();
    int num10,num1;
    num10=num/10;
    num1=num%10;
    if(num1==3||num1==6||num1==9) {
       if(num10==3||num10==6||num10==9)
    	    System.out.println("�ڼ�¦¦");
       else
    	   System.out.println("�ڼ�¦");
    
   }
    sc.close();
}
}