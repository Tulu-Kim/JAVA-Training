//�������� 12-09
package Hw;

import javax.swing.*;
import java.awt.*;

public class Ex12_09 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Ex12_09() {
		setTitle("Ŭ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!", 10, 150);
			setBackground(Color.black);
		}
	}

	public static void main(String[] args) {
		new Ex12_09();
	}
}