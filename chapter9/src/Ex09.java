//Jframe ���� ������ �� �ִ� ��ġ

import javax.swing.*;
import java.awt.*;

public class Ex09 extends JFrame{
	public Ex09() {
		setTitle("���������ӱ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=getContentPane();//���ٵ����� ������ �ڵ������� �˷��ִ� ��� �޼ҵ�
		cp.setBackground(Color.ORANGE);
		cp.setLayout(new FlowLayout());//����Ʈ�ҿ�  FlowLayout��ġ ������ �ޱ�/
		
		cp.add(new JButton("ok"));
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Ignoer"));
		
		setSize(300,300);
		setVisible(true);

	}
	public static void main(String[] ar){
		 Ex09 src = new Ex09();
	}

}
