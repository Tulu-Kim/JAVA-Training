//���� 2-14//
import java.util.Scanner;
public class Hw6_1 {
	public static void main (String[] ar) {
		Scanner sc=new Scanner(System.in);
		
		char grade;
		System.out.println("������ �Է��ϼ���(0~100)");
		int score=sc.nextInt();
		
		 switch(score/10){
		 	 case 10:	 
		 	 case 9: grade = 'A'; break;
			 case 8: grade = 'B'; break;
			 case 7: grade = 'C'; break;
			 case 6: grade = 'D'; break;
			 default: grade = 'F';//������ ������ -1 
			 }
		 System.out.println("������ " + grade + "�Դϴ�.");
		 
		 sc.close();
	
}
}