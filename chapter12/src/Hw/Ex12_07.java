//�������� 12-07
package Hw;

import javax.swing.*;
import java.awt.*;

public class Ex12_07 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Ex12_07() {
		setTitle("�г��� ũ�⿡ ���߾� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(200, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new Ex12_07();
	}
}