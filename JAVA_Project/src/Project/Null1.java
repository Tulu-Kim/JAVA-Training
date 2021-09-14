package Project;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * [3] �� ���̾ƿ����� ���� ��, setLocation(x,y)�� ��ư 9�� ����ϱ�
 *   �̶�, ��ư�� 15�ȼ��� �̵����� ���������� ��ġ�Ѵ�.
 *   - JLabel�� (130,50) ��ġ�� ���
 */
public class Null1 extends JFrame{
 Null1() {
  this.setTitle("NULL ���̾ƿ� ����");
  this.setSize(300, 300);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  //================== �ڵ� �ۼ� ���� ==================

  JPanel pnl = new JPanel(); // �гο� ��ư ����
  pnl.setLayout(null);
  
  JLabel lbl1 = new JLabel("Hello, Press Button");
  lbl1.setSize(130, 20); // ���� ũ�� ����
  lbl1.setLocation(130, 50); // ���� �����ġ ����
  pnl.add(lbl1);
  pnl.setBackground(Color.YELLOW);
  
  // ��ư 1 = (15,15) ��ư 2 = (30,30) ��ư 3 = (45,45) ��ư 4 = (60,60)
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

