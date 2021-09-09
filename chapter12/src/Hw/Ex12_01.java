//예제문제 12-01
package Hw;

import javax.swing.*;
import java.awt.*;

public class Ex12_01 extends JFrame {
	private MyPanel panel = new MyPanel();

	public Ex12_01() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void pnintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 190, 50, 50);
		}
	}

	public static void main(String[] args) {
		new Ex12_01();
	}
}
