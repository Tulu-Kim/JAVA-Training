    package HW;
	import javax.swing.*;
	import java.awt.*;
	public class Hw09_06Hard extends JFrame {
		public Hw09_06Hard() {
			setTitle("Ten Color Buttons Frame");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GridLayout gc = new GridLayout(1,10);
			Container c = getContentPane();
			Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, 
					Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};

	

			c.setLayout(gc);
			for(int i =0;i<col.length;i++) {
				   String txt = Integer.toString(i);
					JButton bt = new JButton(txt);
					c.add(bt);
					//bt.setBackground(col[i]);	
				} 
			/*for(int co=0;co<col.length;co++) {
				String txt = Integer.toString(co);
				JButton bt = new JButton(txt);
					bt.setBackground(col[co]);
			}*/
			

			setSize(800,350);
			setVisible(true);
		}
		public static void main(String[] args) {
			new Hw09_06Hard();
		}
	}
