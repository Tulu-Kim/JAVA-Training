package chapter1;
//�ҽ��ڵ� �����ϱ�(Ű����� ���� �Է¹���//
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] ar) {
		int a,b;
		int result;
		Scanner s =new Scanner(System.in);
		System.out.println("ù��° ���� �Է��Ͻÿ�");
		a=s.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		b=s.nextInt();//�������� �ԷµǴ� ���� ���������� ������.
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
