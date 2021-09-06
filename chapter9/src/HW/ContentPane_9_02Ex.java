//¿¹Á¦ 9-2
package HW;
import javax.swing.*;
import java.awt.*;
public class  ContentPane_9_02Ex extends JFrame {
	public ContentPane_9_02Ex() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignoer"));
		
		setSize(300,150);
		setVisible(true);		
	}
	public static void main(String[] args) {
		new ContentPane_9_02Ex();
	}
}
