//���� 8-11
package Hw;
import java.io.*;
public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("c:/windows/web/wellpaper/Windows 10/img1.jpg");
		
		File dest = new File("c:/Temp/desert.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte [] buf = new byte [1024*10];
			while (true) {
				int n = fi.read(buf);
				fo.write(buf,0,n);;
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		}catch (IOException e) { System.out.println("���� ���� ����");}
	}
}