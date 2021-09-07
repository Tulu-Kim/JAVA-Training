package HW;
import java.awt.*;
import javax.swing.*;
public class Practice9_5 {
 JLabel [] label = new JLabel [10];
 
 Color color = {Color.RRD,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,Color(20,0,100),Color(80,0,100),Color.GRAY,Color.PINK,Color.BLACK}

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