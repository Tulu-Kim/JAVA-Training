    package HW;
	import javax.swing.*;
	import java.awt.*;
	public class Hw09_06Hard extends JFrame {
		public Hw09_06Hard() {
			setTitle("Ten Color Buttons Frame");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GridLayout gc = new GridLayout(1,10);
			Container c = getContentPane();
			
			c.setLayout(gc);
			for(int i =1;i<10;i++) {
				String txt = Integer.toString(i);
					JButton bt = new JButton(txt);
					c.add(bt);
				} 

			setSize(800,350);
			setVisible(true);
		}
		public static void main(String[] args) {
			new Hw09_06Hard();
		}
	}
