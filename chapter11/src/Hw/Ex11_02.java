package Hw;
import javax.swing.*;
import java.awt.*;

import java.awt.*;

public class Ex11_02 extends JFrame{
	public Ex11_02() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//���ڿ� ���̺� ����
		JLabel textLabel = new JLabel("����մϴ�.");
		//�̹��� ���̺� ����
		ImageIcon beauty = new ImageIcon("imgaes/beauty.jpg");
		JLabel imgeLabel = new JLabel(beauty);
		
		//���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		JLabel label = new JLabel("��������� ��ȭ�ϼ���",normalIcon,SwingConstants.CENTER);
		
		//����Ʈ�ҿ� 3���� ���̺� ����
		c.add(textLabel);
		c.add(imgeLabel);
		c.add(label);
		setSize(400,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex11_02();
	}

}
