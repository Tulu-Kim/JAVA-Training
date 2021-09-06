//½Ç½À9-3
package HW;
import javax.swing.*;
import java.awt.*;
public class GridLAyout_9_03TR extends JFrame {
	public GridLAyout_9_03TR() {
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
		new GridLAyout_9_03TR();
	}
}
