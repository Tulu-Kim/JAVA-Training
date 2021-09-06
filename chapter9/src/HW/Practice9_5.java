package HW;
import java.awt.*;
import javax.swing.*;
public class Practice9_5 {
 JLabel [] label = new JLabel [16];
 
 Color color = {Color.Red	,

		 for(int i =0;i<label.length;i++) {
		label[i] = new JLabel(Integer.toString(i);
		label[i].setOpaque(true);
		label[i].setBackground(color[i]);
		c.add(label[i]);
	}
	setSize(500,200);
	setVisible(true);
}
publci static void main(String[] args) {
	new Hw09_04();
}