
/*�λ���� �ϴ� ���������� ������ ������. �λ���� �̸��� ö���� �����̴� . ���� ö��>>�� ����ϰ� ����, ����, �� �� �ϳ��� ���ڿ��� �Է¹޴´�.
 * �׸��� ���� >>�� ����ϰ� ���������� �Է¹޴´�. �Է¹��� ���ڿ��� ���Ͽ� ���� �̰���� �Ǻ��Ͽ� ���ڸ� ����Ѵ�.
 * ->> ö��(�Է°�), ���� (����) -> ��� ��� 
 */

import java.util.*;

public class Rock {

   public static void main(String[] args) {
            outer:
      while(true) {
            String[] strArr = {"����", "����", "��"};
            Scanner sc=new Scanner(System.in);
            System.out.println("���� ���� �� ������ �����մϴ� �Է��ϼ���."+Arrays.toString(strArr));
            System.out.print("����� >>");
            
               for(int i=0;i<100000;i++) {
                  String chul=sc.nextLine();
                  int tmp=(int)(Math.random()*3);
                  System.out.println("��ǻ�� >>"+strArr[tmp]);
                        String young=strArr[tmp];
                  if (chul.equals(young)) {System.out.println("�����ϴ�. �ٽ� �Է��ϼ���");
                     continue;}
               
                  else if(chul.equals("����") && young.equals("����") ) {System.out.println("��ǻ�Ͱ� �̰���ϴ�");break outer;  }
                  else if (chul.equals("����") && young.equals("��")) {System.out.println("����ڰ� �̰���ϴ�");  break outer; }
                  else if(chul.equals("����") && young.equals("��")) {System.out.println("��ǻ�Ͱ� �̰���ϴ�");   break outer; }
                  else if(chul.equals("����") && young.equals("����")) {System.out.println("����ڰ� �̰���ϴ�"); break outer; }
                  else if(chul.equals("��") && young.equals("����")) {System.out.println("��ǻ�Ͱ� �̰���ϴ�");   break outer; }
                  else if (chul.equals("��") && young.equals("����")) {System.out.println("����ڰ� �̰���ϴ�");  break outer;}
               }
               sc.close();
      }
      System.out.println("���� ���� �� ������ �����մϴ�."); 
   }
}