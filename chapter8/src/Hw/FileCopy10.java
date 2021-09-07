//실습문제 8-7
package Hw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class FileCopy10 {
	public static void main(String[] args) {
		File src = new File("a.jpg");
		File dest = new File("B.jpg");
		
	
		try {
			FileInputStream AA = new FileInputStream(src);
			FileOutputStream BB = new FileOutputStream(dest);
			
			System.out.println(src.getPath() + "를"+dest.getPath()+"로 복사합니다.");
			System.out.println("10%마다*를 출력합니다.");
			long File_size =((src.length())/10);
			
			byte []buf = new byte[(int)File_size];
			while(true) {
				int c =AA.read(buf);

				if(c<buf.length)
					break;
				System.out.print("*");
				AA.close();
				BB.close();
			}
			}catch(IOException e) {System.out.println("입출력 오류가 발생했습니다.");};
	}	
}
