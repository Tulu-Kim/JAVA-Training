//�������� 12-02
package Hw;

import javax.swing.*;
import java.awt.*;

public class Ex12_02 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Ex12_02() {
		setTitle("drawString ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(250, 200);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��Դ�.~~", 30, 30);
			g.drawString("�󸶳�? ����", 60, 60);

		}
	}

	public static void main(String[] args) {
		new Ex12_02();
	}
}
