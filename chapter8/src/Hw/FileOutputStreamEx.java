//�ǽ����� 8-6
package Hw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
 
public class FileOutputStreamEx {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		FileInputStream file1,file2;
		FileOutputStream file3;
		String src,dst;
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		src=sc.next();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		dst=sc.next();
		try {
			file1=new FileInputStream(src);
			file2=new FileInputStream(dst);
			file3=new FileOutputStream(new File("appended.txt"));
			
			byte buff[]=new byte[1024];
			while(true) {
				int n=file1.read(buff);
				file3.write(buff,0,buff.length);
				if(n<buff.length) break;
			}
			while(true) {
				int n=file2.read(buff);
				file3.write(buff,0,buff.length);
				if(n<buff.length) break;
			}
			
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����߽��ϴ�.");
			file1.close();
			file2.close();
			file3.close();
			
			sc.close();
		}catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
	}
 
}