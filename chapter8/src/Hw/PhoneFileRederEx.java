//�ǽ����� 8-2
package Hw;
import java.io.*;
public class PhoneFileRederEx {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:/Temp/phone.txt");
			int c;
			System.out.println("c:/Temp/phone.txt�� ��� �մϴ�.");
			while((c=fin.read()) !=-1) {
				System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e) {System.out.println("����� ����");
		}
		
	}
}
