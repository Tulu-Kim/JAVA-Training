
/*두사람이 하는 가위바위보 게임을 만들어보자. 두사람의 이름은 철수와 영희이다 . 먼저 철수>>를 출력하고 가위, 바위, 보 중 하나를 문자열로 입력받는다.
 * 그리고 영희 >>를 출력하고 마찬가지로 입력받는다. 입력받은 문자열을 비교하여 누가 이겼는지 판별하여 승자를 출력한다.
 * ->> 철수(입력값), 영희 (난수) -> 결과 얻기 
 */

import java.util.*;

public class Rock {

   public static void main(String[] args) {
            outer:
      while(true) {
            String[] strArr = {"가위", "바위", "보"};
            Scanner sc=new Scanner(System.in);
            System.out.println("가위 바위 보 게임을 시작합니다 입력하세요."+Arrays.toString(strArr));
            System.out.print("사용자 >>");
            
               for(int i=0;i<100000;i++) {
                  String chul=sc.nextLine();
                  int tmp=(int)(Math.random()*3);
                  System.out.println("컴퓨터 >>"+strArr[tmp]);
                        String young=strArr[tmp];
                  if (chul.equals(young)) {System.out.println("비겼습니다. 다시 입력하세요");
                     continue;}
               
                  else if(chul.equals("가위") && young.equals("바위") ) {System.out.println("컴퓨터가 이겼습니다");break outer;  }
                  else if (chul.equals("가위") && young.equals("보")) {System.out.println("사용자가 이겼습니다");  break outer; }
                  else if(chul.equals("바위") && young.equals("보")) {System.out.println("컴퓨터가 이겼습니다");   break outer; }
                  else if(chul.equals("바위") && young.equals("가위")) {System.out.println("사용자가 이겼습니다"); break outer; }
                  else if(chul.equals("보") && young.equals("가위")) {System.out.println("컴퓨터가 이겼습니다");   break outer; }
                  else if (chul.equals("보") && young.equals("바위")) {System.out.println("사용자가 이겼습니다");  break outer;}
               }
               sc.close();
      }
      System.out.println("가위 바위 보 게임을 종료합니다."); 
   }
}