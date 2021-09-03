//File class 의 Field Summaruy
//구분자강 ㅣㅆ는 이유는 윈도우나 리눅스 어디에서도 호환하여 쓸 수 있도록 정의 하기 위함.

import java.io.*;
public class Ex01 {
	public static void main(String[] ar)
	{
		String a=File.pathSeparator;
		char b=File.pathSeparatorChar;
		String c=File.separator;
		char d=File.separatorChar;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		
		
	}
}
