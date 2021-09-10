
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class Test_03 extends JFrame {
	
	public Test_03(){
		setContentPane(new MyPanel());
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		
		Point pStart=null;
		Point pEnd=null;
		
		Vector<Point> vStart = new Vector<Point>(); 
		Vector<Point> vEnd = new Vector<Point>(); 

		public MyPanel(){
			
			MyMouseListener ml = new MyMouseListener();
			
			this.addMouseListener(ml);
			this.addMouseMotionListener(ml);
		}
		
		
		public void paintComponent(Graphics g){
			super.paintComponent(g); 
			
			if(vStart.size() != 0){
				for(int i=0;i<vEnd.size();i++){
					Point sp = vStart.get(i); 
					Point ep = vEnd.get(i);	
					g.drawLine(sp.x, sp.y, ep.x, ep.y);
				}
			}
			if(pStart != null)
				g.drawLine(pStart.x, pStart.y, pEnd.x, pEnd.y);				
		}
		
		class MyMouseListener extends MouseAdapter implements MouseMotionListener{
			public void mousePressed(MouseEvent e){
				pStart = e.getPoint();
				vStart.add(e.getPoint()); 
			}
			public void mouseReleased(MouseEvent e){
				vEnd.add(e.getPoint()); 
				repaint();
			}
			
			public void mouseDragged(MouseEvent e){
				pEnd = e.getPoint();
				repaint();
			}
			
			public void mouseMoved(MouseEvent e){
				
			}
		}
	}
	
	public static void main(String[] args) {
		new Test_03();
	}
}