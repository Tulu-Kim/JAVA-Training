//실습10-07
package HW;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tr_10_07 extends JFrame  {
	private JLabel jl = new JLabel("Love Java");
	public Tr_10_07() {
		setTitle("마우스 휠을 굴려 폰트 크기 조정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JLabel la = new JLabel("Love Java");
		la.setHorizontalAlignment(JLabel.CENTER);
		
		la.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				// TODO Auto-generated method stub
				int n=e.getWheelRotation();
				Font f=la.getFont();
				int size=f.getSize();
				if(n<0) {
					if(size-5>0) {
						la.setFont(new Font("Arial",Font.PLAIN,size-5));
					}
				}
				else {
					la.setFont(new Font("Arial",Font.PLAIN,size+5));
				}
			}
		});
		c.add(la,BorderLayout.NORTH);
		setSize(350,150);
		setVisible(true);	
			}
	public static void main(String[] args) {
		new Tr_10_07();
	}
}
