
package Hw;
import java.awt.*;
import java.util.TimerTask;

import javax.swing.*;

class Ex13_01_sub extends Thread {
	private JLabel timerLabel;
	
	public Ex13_01_sub(JLabel timerLabel) {
		this.timerLabel = timerLabel;
		}
	
	public void run() {
		int n =0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
		n++;
			try {Thread.sleep(100);
			}
			catch(InterruptedException e) {return;}
		}
	}
}
public class Ex13_01 extends JFrame{
	public Ex13_01() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		Ex13_01_sub th = new Ex13_01_sub(timerLabel);
		
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) {
		new Ex13_01();
	}
}
