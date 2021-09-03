//switch문을 사용하여 연도별 띠를 나타내는 프로그램을 작성해라//
import java.util.Scanner;
public class Hw7 {
	public static void main (String[] ar) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("년도를 입력하십시오.");
		int year=sc.nextInt();
	    String zodiac="";
		switch(year%12){
		 	 case 0: zodiac="원숭이"; break;
		 	 case 1: zodiac="닭"; break;
		 	 case 2: zodiac="개"; break;
		 	 case 3: zodiac="돼지"; break;
		 	 case 4: zodiac="쥐"; break;
		 	 case 5: zodiac="소"; break;
		 	 case 6: zodiac="호랑이"; break;
		 	 case 7: zodiac="토끼"; break;
		 	 case 8: zodiac="용"; break;
		 	 case 9: zodiac="뱀"; break;
		 	 case 10: zodiac="말"; break;
		 	 case 11: zodiac="양"; break;

		}
		
		 System.out.println(year+"년은  "+zodiac+"띠의 해 입니다.");
		 sc.close();
	
}
}