//�ǽ�10-01
package HW;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Tr_10_01_sub extends JFrame implements MouseListener{
	    JLabel la = new JLabel("�����");
	    Container c = getContentPane();
	    public Tr_10_01_sub() {
		setTitle("Tr_10_01_sub");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setLayout(new BorderLayout());
		la.setHorizontalAlignment(JLabel.CENTER);//��� ����
		c.add( la,BorderLayout.NORTH);
		setSize(350,150);
		setVisible(true);
	
		this.start();
	}

	public void start() {//��ư�� Ŭ���� A�� ��Ī �����ش�
		la.addMouseListener(this);
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
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la) {
			la.setText("Love Java");
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==la) {
			la.setText("�����");
		}
}
}
public class Tr_10_01 {
	public static void main(String[] ar) {
		new Tr_10_01_sub();
	}
}