package Project;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Clock extends JFrame implements Runnable {
	Container contentPane;
	// ���� �׸� �� �ִ� �г��� �����Ѵ�.
		// �� �гο� Mouse �����ʸ� �����Ѵ�.

		int ox, oy, r;
		Calendar cal = Calendar.getInstance();

		 ox=oy=300;
		 r1=200;
	Clock() {
		setTitle("Analgo Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		// contentPane.add(panel, BorderLayout.CENTER);
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		Clock clock = new Clock();
		Thread t = new Thread(clock);
		t.start();

	}

	

	public void paintComponent(Graphics g) {
			//super.paintComponent(g);
			cal = Calendar.getInstance();
			int sec = cal.get(Calendar.SECOND); // �� ����
			int min = cal.get(Calendar.MINUTE); // �� ����
			int hour = cal.get(Calendar.HOUR); // �� ����
			int millis = cal.get(Calendar.MILLISECOND);

			// �ð� �׵θ�
			g.setColor(Color.BLUE);
			g.drawOval(100, 100, 400, 400);
			g.setColor(Color.RED);
			for (int i = 0; i <= 360; i += 6) { // �ð� �׵θ�
				int x1 = (int) (r * Math.sin(3.1415 * i / 180) + ox);
				int y1 = (int) (r * Math.cos(3.1415 * i / 180) + oy);
				int x2 = (int) ((r - 5) * Math.sin(3.1415 * i / 180) + ox);
				int y2 = (int) ((r - 5) * Math.cos(3.1415 * i / 180) + oy);

				if (i % 30 == 0) { // ū ���� ǥ��
					int j = 1;
					x2 = (int) ((r - 20) * Math.sin(3.1415 * i / 180) + ox);
					y2 = (int) ((r - 20) * Math.cos(3.1415 * i / 180) + oy);
				}
				g.drawLine(x1, y1, x2, y2);

			}

			if (sec == 60) {
				sec = 0;
				min++;
			}
			if (min == 60) {
				min = 0;
				hour++;
			}
			if (min == 60 && hour == 12) {
				hour = 0;
			}

			sec = sec * 6 - 90;
			int xSecond = (int) (r * Math.cos(3.1415 * sec / 180) + ox);
			int ySecond = (int) (r * Math.sin(3.1415 * sec / 180) + oy);
			g.setColor(Color.RED);
			g.drawLine(ox, oy, xSecond, ySecond);

			min = cal.get(Calendar.MINUTE)*6 + sec/60 - 90;
			int xMinute = (int) (150 * Math.cos(3.1415 * min / 180) + ox);
			int yMinute = (int) (150 * Math.sin(3.1415 * min / 180) + oy);
			g.setColor(Color.BLUE);
			g.drawLine(ox, oy, xMinute, yMinute);

			hour = hour * 30 + cal.get(Calendar.MINUTE) /2 - 90 ;
			int xHour = (int) (100 * Math.cos(3.1415 * hour / 180) + ox);
			int yHour = (int) (100 * Math.sin(3.1415 * hour / 180) + oy);
			g.setColor(Color.BLACK);
			g.drawLine(ox, oy, xHour, yHour);

		}

	public void update(Graphics g) 
		{
			paintComponent(g);
		}

	public void run() {
			try {
				while (true) {
					Thread.sleep(1000);
					repaint();
				}
			} catch (Exception e) {
			}
		}

}
