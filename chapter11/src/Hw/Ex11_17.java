package Hw;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex11_17 extends JFrame {
	String[] str = { "1번마", "2번마", "3번마" };
	ImageIcon[] imgs = { new ImageIcon("images/rpgiab_icon_pack/32x32/star.png"),
			new ImageIcon("images/rpgiab_icon_pack/32x32/light.png"),
			new ImageIcon("images/rpgiab_icon_pack/32x32/weather_sun.png") };
	JLabel la = new JLabel();

	Ex11_17() {
		setTitle("ComboTest");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JComboBox<String> combo = new JComboBox<String>(str);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la.setIcon(imgs[0]);
		c.add(combo);
		c.add(la);
		setVisible(true);
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = combo.getSelectedIndex();
				la.setIcon(imgs[index]);
			}
		});
	}

	public static void main(String[] args) {
		new Ex11_17();
	}
}
