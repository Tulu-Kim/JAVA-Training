//do while
//switch ����
import java.util.Scanner;
import java.io.*;
public class Hw04 {
	public static void main(String[] ar) throws IOException {
		int su1=0,su2=0,result=0,tot=0;
		char yon;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("su1=");
		su1=sc.nextInt();
		
		do {
		System.out.println("yon(+,-,*,/)=");
		//yon=(char)sc.nextInt();
		yon=(char)System.in.read();
		System.in.read();
		System.in.read();
		}while(yon != '+' && yon!='-' && yon !='*' && yon !='/');
		//+-*/ �� �ƴϸ� �ٽ� �����Ѵ�.
		do {
		System.out.print("su2=");
		su2=sc.nextInt();
		}while(yon=='/'&& su2==0);
		
			switch(yon) {
		case '+' : tot=su1+su2; break;
		case '-' : tot=su1-su2; break;
		case '*' : tot=su1*su2; break;
		case '/' : tot=su1/su2; break;
		}
		System.out.println();
		System.out.println(su1+" "+yon+" "+su2+"="+tot);
		sc.close();
	}

}
