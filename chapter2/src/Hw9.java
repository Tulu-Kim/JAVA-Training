
import java.util.Scanner;
public class Hw9 {
   public static void main(String[] at) {
      int su1,su2,su3;
      
      Scanner sc=new Scanner(System.in);
            
      System.out.println("ù��° ���ڸ� �Է��ϼ���?");
      su1=sc.nextInt();
      System.out.println("�ι�° ���ڸ� �Է��ϼ���?");
      su2=sc.nextInt();
      System.out.println("����° ���ڸ� �Է��ϼ���?");
      su3=sc.nextInt();
      
      if(su1>=su2 && su1>=su3) {}
      else if(su2>su1 && su2>=su3) {
         int imsi=su1;
         su1=su2;
         su2=imsi;
      }
      else if(su3>su1 && su3>su2) {
         int imsi=su1;
         su1=su3;
         su3=imsi;
      }
      if(su3>su2) {
         int imsi=su2;
         su2=su3;
         su3=imsi;
      }
      System.out.println(+su2+"�� �߰�ũ���� �����Դϴ�.");
      sc.close();   
   }

}
