//�ǽ����� 8-1

package Hw;
import java.io.*;
import java.util.*;
public class PhoneFileWriterEX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		try {
			fout = new FileWriter("C:/Temp/phone.txt");
			while(true) {
				System.out.println("�̸� ��ȭ��ȣ >>");
				String line = scanner.nextLine();
				if(line.equals("�׸�"))
					break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch (IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}

}
