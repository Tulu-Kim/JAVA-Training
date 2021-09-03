import java.util.Scanner;
public class Ex10 {
	public static void main (String[] ar) {
		 int su,year;
		 String str="";
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("당신의 주민등록번호의 7번째 숫자는?");
		 su=sc.nextInt();
		 switch(su){
			 case 9: year=1800; break;
			 case 0: year=1800; break;
			 case 1: year=1900; break;
			 case 2: year=1900; break;
			 case 3: year=2000; break;
			 case 4: year=2000; break;
			 default: year=-1;//엉뚱한 숫자인 -1 
		 }
		 
		 switch(su%2) {
		 case 0: str="여성";break;
		 case 1 : str = "남성";break;
		 }
		 if(year==-1) {
			 System.out.println("잘못입력하셨습니다.");
		 }			 
		 else {
			 System.out.println("당신은"+year+"년대"+str+"입니다.");
		 }
		 sc.close();   
	}
	
}
