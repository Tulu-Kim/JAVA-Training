package HW;

import java.awt.event.MouseWheelEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Team2 extends JFrame{
   public Team2() {
      setTitle("제목");
      JPanel panel = new JPanel();
      JLabel label = new JLabel("ID  ");
      JLabel label2 = new JLabel("P/W  ");
      JTextField txtID = new JTextField(20);
      JPasswordField txtPass = new JPasswordField(20);
      JButton logbtn = new JButton("로그인");
      JButton logbtn1 = new JButton("취소");
      JButton logbtn2 = new JButton("회원가입");
      
      panel.add(label);
      panel.add(txtID);
      panel.add(label2);
      panel.add(txtPass);
      panel.add(logbtn);
      panel.add(logbtn1);
      panel.add(logbtn2);
      
      add(panel);
      
      setVisible(true);
      setSize(270,200);
      setLocationRelativeTo(null);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }
   public static void main(String[] args) {
      new Team2();
   }

}