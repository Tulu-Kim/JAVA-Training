//while
import java.io.*;
public class Ex07 {
	public static void main(String[] ar)throws IOException {
		while(true) {
			System.out.print("����=");
			char ch=(char)System.in.read();
		System.in.read(); //����Ű�� ���� ó������(cr/if�� �ι� ����)
		System.in.read();
		System.out.println(ch+"="+(int)ch);
		
		//���̵� ������(���ѷ������� Ż���ϱ� ����)
		System.out.println("���? Y/N");
		char c=(char)System.in.read();
		System.in.read();
		System.in.read();
		if(c=='N'||c=='n') break;		}
	}
}
