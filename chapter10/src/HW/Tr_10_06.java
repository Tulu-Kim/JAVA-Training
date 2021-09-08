//½Ç½À10-06
package HW;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Tr_10_06 extends JFrame implements MouseListener{
	JLabel la = new JLabel("c");
	public Tr_10_06() {
	setTitle("C");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(null);
		
	la.setLocation(100,100);
	la.setSize(50,50);
	c.add(la);
	setSize(500,500);
	setVisible(true);
	
	la.addMouseListener(this);
	this.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		
		int x=(int)(Math.random()*450);
		int y=(int)(Math.random()*450);
		if(e.getSource()==la)
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

	
	public static void main(String[] ar) {
		new Tr_10_06();
	}
}