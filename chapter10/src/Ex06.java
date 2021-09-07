//MouseAdapter�� MouseListener�� ���� �̺�Ʈ ó�����
import java.awt.*;
import java.awt.event.*;

class Ex06_sub extends Frame implements 
MouseListener,MouseMotionListener{
	private Label lb = new Label("x=000,y=000");
	private Button bt =new Button("Ȯ��");
	
	private BorderLayout bl=new BorderLayout();
	
	public Ex06_sub(String title) {
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
		this.setLayout(bl);
		this.add("North",lb);
		this.add("South",bt);
		
	}
	public void start() {//��ư�� Ŭ���� A�� ��Ī �����ش�
		bt.addMouseListener(this);
		this.addMouseMotionListener(this);
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
		if(e.getSource()==bt) {
			bt.setLabel("��ư���� ���콺�� �ֳ׿�");
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==bt) {
			bt.setLabel("Ȯ��");
		}
		
	}
	//MouseMotion�� �����Ǻ� �޼ҵ�
	@Override
	public void mouseDragged(MouseEvent e) {
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		if(e.getSource()==this) {
			//���࿡ �� ������ this���¿��� �߻��� ��ٸ�
			int x=e.getX();
			int y=e.getY();
			lb.setText("x="+x+"y="+y);
		}
		
	}
}
public class Ex06 {
	public static void main(String[] ar) {
		new Ex06_sub("����");
	}
}

