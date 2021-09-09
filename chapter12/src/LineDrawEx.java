
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class LineDrawEx extends JFrame {
	
	public LineDrawEx(){
		setContentPane(new MyPanel());
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		
		Point startP=null;
		Point endP=null;
		
		Vector<Point> sv = new Vector<Point>(); // ����
		Vector<Point> se = new Vector<Point>(); // ����

		public MyPanel(){
			//�����ʸ� ���������ؾ�  �������� �����ȴ�.
			MyMouseListener ml = new MyMouseListener();
			
			this.addMouseListener(ml); // ������
			this.addMouseMotionListener(ml);
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g); // �θ� ����Ʈȣ��
			
			if(sv.size() != 0){
				for(int i=0;i<se.size();i++){ //����ũ�⸸ŭ
					Point sp = sv.get(i); // ���Ͱ���������
					Point ep = se.get(i);	
					g.drawLine(sp.x, sp.y, ep.x, ep.y);//�׸���
				}
			}
			if(startP != null)
				g.drawLine(startP.x, startP.y, endP.x, endP.y);				
		}
		
		class MyMouseListener extends MouseAdapter implements MouseMotionListener{
			public void mousePressed(MouseEvent e){
				startP = e.getPoint();
				sv.add(e.getPoint()); // Ŭ���Ѻκ��� ����������
			}
			public void mouseReleased(MouseEvent e){
				se.add(e.getPoint()); // �巡�� �Ѻκ��� ����������
				endP = e.getPoint();
				repaint(); // �ٽñ׷���
			}
			
			public void mouseDragged(MouseEvent e){
				endP = e.getPoint();
				repaint();
			}
			
			public void mouseMoved(MouseEvent e){
				
			}
		}
	}
	
	public static void main(String[] args) {
		new LineDrawEx();
	}
}