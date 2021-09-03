//실습문제 8-3
package Hw;
import java.io.*;
public class SystemFileReaderUpperCaseEX {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:/windows/system.ini");
			int c;
			while((c=fin.read()) !=-1) {
			    c = Character.toUpperCase(c);

			    System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e) {System.out.println("입출력 오류");
		}
		
	}
}
