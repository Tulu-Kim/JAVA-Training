//실습문제 8-6
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
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		src=sc.next();
		System.out.print("두번째 파일 이름을 입력하세요>>");
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
			
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장했습니다.");
			file1.close();
			file2.close();
			file3.close();
			
			sc.close();
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}
 
}