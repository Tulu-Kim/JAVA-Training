import java.util.Scanner;
public class Ex10 {
	public static void main (String[] ar) {
		 int su,year;
		 String str="";
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("����� �ֹε�Ϲ�ȣ�� 7��° ���ڴ�?");
		 su=sc.nextInt();
		 switch(su){
			 case 9: year=1800; break;
			 case 0: year=1800; break;
			 case 1: year=1900; break;
			 case 2: year=1900; break;
			 case 3: year=2000; break;
			 case 4: year=2000; break;
			 default: year=-1;//������ ������ -1 
		 }
		 
		 switch(su%2) {
		 case 0: str="����";break;
		 case 1 : str = "����";break;
		 }
		 if(year==-1) {
			 System.out.println("�߸��Է��ϼ̽��ϴ�.");
		 }			 
		 else {
			 System.out.println("�����"+year+"���"+str+"�Դϴ�.");
		 }
		 sc.close();   
	}
	
}
