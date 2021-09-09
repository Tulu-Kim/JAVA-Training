//도전문제
package Hw;
import javax.swing.*;
import java.awt.*;

public class GridLayout_HARD extends JFrame{
	public GridLayout_HARD() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,5));
	    Object[] imege_list;
		
	    ImageIcon cherry = new ImageIcon("images/cherry.jpg");
		ImageIcon image1 = new ImageIcon("images/img1.jpg");
		ImageIcon apple = new ImageIcon("images/apple.jpg");
		ImageIcon kiwi = new ImageIcon("images/kiwi.jpg");
		ImageIcon mango = new ImageIcon("images/mango.jpg");
		ImageIcon pear = new ImageIcon("images/pear.jpg");
		ImageIcon img2 = new ImageIcon("images/img2.jpg");
		ImageIcon img = new ImageIcon("images/img.jpg");
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		
		
		JButton cherry_bt = new JButton(cherry);
		JButton image1_bt = new JButton(image1);
		JButton apple_bt = new JButton(apple);
		JButton kiwi_bt = new JButton(kiwi);
		JButton mango_bt = new JButton(mango);
		JButton pear_bt = new JButton(pear);
		JButton img2_bt = new JButton(img2);
		JButton img_bt = new JButton(img);
		JButton normalIcon_bt = new JButton(normalIcon);
	
		
		c.add(cherry_bt);
		c.add(image1_bt);
		c.add(apple_bt);
		c.add(kiwi_bt);
		c.add(mango_bt);
		c.add(pear_bt);
		c.add(img2_bt);
		c.add(img_bt);
		c.add(normalIcon_bt);
		
		setSize(800,400);
		setVisible(true);

	}
	public static void main(String[] args) {
		new GridLayout_HARD();
	}

}
