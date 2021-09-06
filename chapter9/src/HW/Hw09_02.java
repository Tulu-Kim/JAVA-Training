//Hw2
package HW;
import javax.swing.*;
import java.awt.*;

public class Hw09_02 extends JFrame{
	public Hw09_02() {
		setTitle("스윙프레임구성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=getContentPane();//컨텐드팬의 내용을 자동적으로 알려주는 기능 메소드
		cp.setBackground(Color.ORANGE);
		cp.setLayout(new FlowLayout());//컨텐트팬에  FlowLayout배치 관리자 달기/
		
		cp.add(new JButton("add"));
		cp.add(new JButton("sub"));
		cp.add(new JButton("mul"));
		cp.add(new JButton("div"));
		cp.add(new JButton("calculate"));
		
		setSize(300,400);
		setVisible(true);

	}
	public static void main(String[] ar){
		 new Hw09_02();
	}

}
