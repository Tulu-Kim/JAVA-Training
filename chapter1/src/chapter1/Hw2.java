package chapter1;
import java.util.Scanner;
public class Hw2 {
	public static void main(String ar[]) {
		int  a,b;
		int f;
		int result;
		Scanner s =new Scanner(System.in);
		System.out.println("������ �������� ��ȣ[+(1),-(2),*(3),/(4)]�� �Է��Ͻÿ�");
		f=s.nextInt();
		System.out.println("ù��°���� �Է��Ͻÿ�");
		a=s.nextInt();
		System.out.println("�ι�°���� �Է��Ͻÿ�");
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
			System.out.println("�������� �����Ҽ� �����ϴ�. �ι�°���� 0 �̿��� ������ �Է��� �ֽʽÿ�,");
		}
	}
}
