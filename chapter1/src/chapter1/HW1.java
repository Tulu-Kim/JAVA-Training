package chapter1;
//����4���� �Է¹޾Ƽ� �� ���� ���ϴ� ���α׷�//
import java.util.Scanner;
public class HW1 {
	public static void main(String[] ar) {
		int a,b,c,d;
		int result;
		Scanner s =new Scanner(System.in);
		System.out.println("ù��° ���� �Է��Ͻÿ�");
		a=s.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		b=s.nextInt();//�������� �ԷµǴ� ���� ���������� ������.
		System.out.println("����° ���� �Է��Ͻÿ�");
		c=s.nextInt();
		System.out.println("�׹�° ���� �Է��Ͻÿ�");
		d=s.nextInt();
		result=a+b+c+d;
		System.out.println(a+"+"+b+"+"+c+"+"+d+"="+result);

}
}

