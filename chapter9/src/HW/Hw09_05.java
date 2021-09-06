//Hw 5
package HW;
import javax.swing.*;
import java.awt.*;
public class Hw09_05 extends JFrame{
	public Hw09_05() {
	
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(50,5));
		c.add(new JButton("CENTER"),BorderLayout.CENTER);
		c.add(new JButton("NORTH"),BorderLayout.NORTH);
		c.add(new JButton("SOUTH"),BorderLayout.SOUTH);
		c.add(new JButton("EAST"),BorderLayout.EAST);
		c.add(new JButton("WEST"),BorderLayout.WEST);
		
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Hw09_05();
	}
}
