//File class 생성자 이야기
import java.io.*;

public class Ex02 {
	public static void main(String[] ar) {
		File f=new File("Ex01.java");//존재유무를 떠나 만들수 잇음.
		File f1=new File("Ex03.java");//
		File f2= new File("C:\\CookJava\\chapter8\\src\\Ex01.java");
		File dir=new File("C:\\CookJava\\chapter8\\src\\");
		File f4=new File(dir,"Ex02.java");		

	}

}
