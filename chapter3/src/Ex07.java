//while
import java.io.*;
public class Ex07 {
	public static void main(String[] ar)throws IOException {
		while(true) {
			System.out.print("문자=");
			char ch=(char)System.in.read();
		System.in.read(); //엔터키에 대한 처리내용(cr/if의 두번 수행)
		System.in.read();
		System.out.println(ch+"="+(int)ch);
		
		//가이드 제시함(무한루프에서 탈출하기 위함)
		System.out.println("계속? Y/N");
		char c=(char)System.in.read();
		System.in.read();
		System.in.read();
		if(c=='N'||c=='n') break;		}
	}
}
