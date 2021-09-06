//Hw 4
package HW;
import java.awt.*;
import javax.swing.*;
public class Hw09_04 extends JFrame {
	public Hw09_04() {
		setTitle("Hw09_04");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello Press Button!");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		
		
		setSize(300,200);
		setVisible(true);
	}
public static void main(String[] args) {
	new Hw09_04();
}
}