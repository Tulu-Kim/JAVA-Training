
import java.util.Scanner;
public class Hw9 {
   public static void main(String[] at) {
      int su1,su2,su3;
      
      Scanner sc=new Scanner(System.in);
            
      System.out.println("첫번째 숫자를 입력하세요?");
      su1=sc.nextInt();
      System.out.println("두번째 숫자를 입력하세요?");
      su2=sc.nextInt();
      System.out.println("세번째 숫자를 입력하세요?");
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
      System.out.println(+su2+"가 중간크기의 숫자입니다.");
      sc.close();   
   }

}
