//Hw2
package HW;
import javax.swing.*;
import java.awt.*;

public class Hw09_02 extends JFrame{
	public Hw09_02() {
		setTitle("���������ӱ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=getContentPane();//���ٵ����� ������ �ڵ������� �˷��ִ� ��� �޼ҵ�
		cp.setBackground(Color.ORANGE);
		cp.setLayout(new FlowLayout());//����Ʈ�ҿ�  FlowLayout��ġ ������ �ޱ�/
		
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
