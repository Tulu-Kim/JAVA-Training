package Project;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * [3] 널 레이아웃으로 설정 후, setLocation(x,y)에 버튼 9개 출력하기
 *   이때, 버튼은 15픽셀씩 이동시켜 겹쳐지도록 배치한다.
 *   - JLabel은 (130,50) 위치에 출력
 */
public class Null1 extends JFrame{
 Null1() {
  this.setTitle("NULL 레이아웃 예제");
  this.setSize(300, 300);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  //================== 코드 작성 구간 ==================

  JPanel pnl = new JPanel(); // 패널에 버튼 부착
  pnl.setLayout(null);
  
  JLabel lbl1 = new JLabel("Hello, Press Button");
  lbl1.setSize(130, 20); // 라벨의 크기 설정
  lbl1.setLocation(130, 50); // 라벨의 출력위치 설정
  pnl.add(lbl1);
  pnl.setBackground(Color.YELLOW);
  
  // 버튼 1 = (15,15) 버튼 2 = (30,30) 버튼 3 = (45,45) 버튼 4 = (60,60)
  for(int i = 1; i<=9; i++) {
   JButton btn = new JButton(Integer.toString(i));
   btn.setLocation(15*i, 15*i);
   btn.setSize(50, 20);
   pnl.add(btn);
  }
     //==============================================
  
  this.add(pnl);
  this.setVisible(true);
 }

 public static void main(String[] args) {
  new Null1();

 }

} 

