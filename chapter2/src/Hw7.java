//switch���� ����Ͽ� ������ �츦 ��Ÿ���� ���α׷��� �ۼ��ض�//
import java.util.Scanner;
public class Hw7 {
	public static void main (String[] ar) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�⵵�� �Է��Ͻʽÿ�.");
		int year=sc.nextInt();
	    String zodiac="";
		switch(year%12){
		 	 case 0: zodiac="������"; break;
		 	 case 1: zodiac="��"; break;
		 	 case 2: zodiac="��"; break;
		 	 case 3: zodiac="����"; break;
		 	 case 4: zodiac="��"; break;
		 	 case 5: zodiac="��"; break;
		 	 case 6: zodiac="ȣ����"; break;
		 	 case 7: zodiac="�䳢"; break;
		 	 case 8: zodiac="��"; break;
		 	 case 9: zodiac="��"; break;
		 	 case 10: zodiac="��"; break;
		 	 case 11: zodiac="��"; break;

		}
		
		 System.out.println(year+"����  "+zodiac+"���� �� �Դϴ�.");
		 sc.close();
	
}
}