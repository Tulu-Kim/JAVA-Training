//�ǽ����� 8-4
package Hw;
import java.io.*;
import java.util.Scanner;
public class SystemFileReaderLineNumberEX {
	public static void main(String[] args) {
		File fin = new File("c:/windows/system.ini");
		try {
			Scanner scanner = new Scanner(new FileReader("c:/windows/system.ini"));
			int lineNumber = 1;
			System.out.println(fin.getPath()+"������ �о� ����մϴ�.");
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.printf("%4d: ",lineNumber);
				System.out.println(line);
				lineNumber++;
			}
			scanner.close();
		}catch(IOException e) {System.out.println("����� ����");
		}
		
	}
}
