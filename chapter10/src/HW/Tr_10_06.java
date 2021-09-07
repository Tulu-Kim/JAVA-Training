package HW;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import HW.Tr_10_02.MyMouse;

class Tr_10_06 extends JFrame{
	JLabel la = new JLabel("c");
	public Tr_10_06() {
	setTitle("C");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(null);
	
	
	la.setLocation(100,100);
	la.setSize(20,20);
	c.add(la);
	
	MyMouse listener = new MyMouse();
	c.addMouseListener(listener);
	setSize(500,500);
	setVisible(true);
		
	}


class MyMouse implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		int x = 0,y=0;
		if(e.getSource()==la)
		x=(int)(Math.random()*150);
		y=(int)(Math.random()*150);
		la.setLocation(x,y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}

	public static void main(String[] ar) {
		new Tr_10_06();
	}
}