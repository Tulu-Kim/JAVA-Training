package HW;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ex10_02 extends JFrame{
	public Ex10_02() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	// 내부 클래스 ActionListener
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			Ex10_02.this.setTitle(b.getText());
		}
	}
	public static void main(String[] args) {
		new Ex10_02();
	}
}
