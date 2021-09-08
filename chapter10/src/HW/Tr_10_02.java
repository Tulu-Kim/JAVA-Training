//½Ç½À10-02
package HW;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tr_10_02 extends JFrame{
	Container c = getContentPane();
	public Tr_10_02() {
		setTitle("Tr_10_02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		MyMouse listener = new MyMouse();
		c.setBackground(Color.green);
		c.addMouseMotionListener(listener);
		c.addMouseListener(listener);
		setSize(300,200);
		setVisible(true);
	}
	class MyMouse implements MouseMotionListener,MouseListener{
	
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			c.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			c.setBackground(Color.GREEN);
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
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

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
	public static void main(String[] args) {
		new Tr_10_02();
	}
}
