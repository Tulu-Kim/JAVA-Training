//?ǽ?9-2
package HW;
import javax.swing.*;
import java.awt.*;
public class  BorderLayout_9_02TR extends JFrame{
	public BorderLayout_9_02TR() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5,7));
		c.add(new JButton("CENTER"),BorderLayout.CENTER);
		c.add(new JButton("NORTH"),BorderLayout.NORTH);
		c.add(new JButton("SOUTH"),BorderLayout.SOUTH);
		c.add(new JButton("EAST"),BorderLayout.EAST);
		c.add(new JButton("WEST"),BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayout_9_02TR();
	}

}
