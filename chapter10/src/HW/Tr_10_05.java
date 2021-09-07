package HW;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Tr_10_05_sub extends JFrame {
	    JLabel la = new JLabel("Love Java");
	    int size=20;
	    Container c = getContentPane();
	   public Tr_10_05_sub() {
		setTitle("Tr_10_01_sub");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		c.setLayout(new BorderLayout());
		la.setHorizontalAlignment(JLabel.CENTER);//가운데 정렬
		while(true) {
		
			if(+.equals(+)) {
			size+=5;
		}
		if(-.equals(-)) {
			size-=5;
		}
		}
		Font font = new Font("궁서 보통",Font.BOLD,size);
		la.setFont(font);
		c.add(la,BorderLayout.NORTH);
		setSize(350,150);
		setVisible(true);	
}
	   class MykeyListener extends KeyAdapter{
		   public
	   }
public class Tr_10_05 {
	public static void main(String[] ar) {
		new Tr_10_05_sub();
	}
}