
package HW;
import javax.swing.*;
import java.awt.*;
public class Tr_09_04 extends JFrame {
	public Tr_09_04() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gc = new GridLayout(1,10);
		Container c = getContentPane();
		Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, 
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};



		c.setLayout(gc);
		for(int i =1;i<10;i++) {
			String txt = Integer.toString(i);
				JButton bt = new JButton(txt);
				c.add(bt);
				bt.setBackground(col[i]);	
		} 
		

		setSize(800,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Tr_09_04();
	}
}
