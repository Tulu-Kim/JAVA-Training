//예제문제 12-04
package Hw;

import javax.swing.*;
import java.awt.*;

public class Ex12_04 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Ex12_04() {
		setTitle("drawLine 사용예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(200, 170);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);

		}
	}

	public static void main(String[] args) {
		new Ex12_04();
	}
}