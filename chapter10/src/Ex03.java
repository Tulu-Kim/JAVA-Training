
//MouseListener�� ��ưŬ���� ������
import java.awt.*;
import java.awt.event.*;

class Ex03_sub extends Frame{
	private Button bt =new Button("Ȯ��");
	private GridBagLayout gbl=new GridBagLayout();
	
	public Ex03_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		super.setSize(500,300);
		this.init();//ȭ���ʱ�ȭ
		this.start();//�߰��Ǵ� �̺�Ʈ�� ����
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
		
	}
	public void init() {
		this.setLayout(gbl);
		this.add(bt);
		
	}
	public void start() {//��ư�� Ŭ���� A�� ��Ī �����ش�
		AAA ap=new AAA();
		bt.addMouseListener(ap);
	}
}
public class Ex03 {
	public static void main(String[] ar) {
		new Ex01_sub("����");
	}
}

class AAA implements MouseListener{
	//public void aaa() {
	//	System.exit(0);
	//}
	public void mouseClicked(MouseEvent e) {
		//A��� Ŭ������ ȣ�߷ھ����� �ڵ����� 
		//ȣ��ǵ��� ��ӵǾ��� �޼ҵ���.
		System.exit(0);
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