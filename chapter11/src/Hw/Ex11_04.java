//����11-04
package Hw;
import javax.swing.*;
import java.awt.*;

public class Ex11_04 extends JFrame{
	public Ex11_04() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("imgaes/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��",true);
		JCheckBox cherry = new JCheckBox("ü��",cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);

		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);

	}
	public static void main(String[] args) {
		new Ex11_04();
	}

}
