//Graphics Ŭ���� �޼ҵ��� ��� �׸��� �׷����� ����
//drawLine, drawRect,drawOvel,drawPolygon,
//fillRect fillOver,fillPolygon

//�̹��� ��ü�� ������
//1.Toolkit t = Toolkit.getDefaultToolkit();
//2.Image img=t.getImage;

import java.awt.*;
import java.awt.event.*;


class Ex03_sub extends Frame implements ActionListener{
	private Button bt1 = new Button("Ȯ��");
	private Button bt2 = new Button("���");

	private BorderLayout bl= new BorderLayout();	
	private Panel p = new Panel();
	private FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT);
	
	private Image img;
	
	private int size = 100;
	public Ex03_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		super.setSize(500,300);
		this.init();
		this.start();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
		
	}
	public void init() {
		img=Toolkit.getDefaultToolkit().getImage("apple.jpg");
		this.setLayout(bl);
		p.setLayout(f1);
		p.add(bt1);
		p.add(bt2);
		this.add("North",p);
		
		//this.add("North",bt);
	}
	public void start() {
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
	}
	//public void update(Graphics g) {}
	public void paint(Graphics g) {
		
		/*
		g.drawLine(50, 50, 100, 100);
		
		g.setColor(Color.RED);
		//g.drawLine(10, 10, 100, 100);
		g.drawRect(50, 50,100,100);
		
		//���� �簢���� �׸���
		g.setColor(Color.BLUE);
		g.fillRect(160, 50, 100,100);
	
		//�̹��� �� ��Ʈ�� ���ڻ��� �����Ͽ� ����־��
		g.setColor(Color.CYAN);
		g.setFont(new Font("����,",Font.BOLD,20));
		g.drawString("�ݰ����ϴ�.",100,100);
	
		//�ﰢ���� ���
		g.setColor(Color.GREEN);
		int[] x = {80,100,50};
		int[] y = {30,90,85};
		g.drawPolygon(x,y,3);
*/
		//�̹��� ������ �����ӿ� �ø��� �椲��
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img=t.getImage("C:\\CookJava\\chapter12\\images\\apple.jpg");
//		g.drawImage(img, 50, 50, this);
        g.drawImage(img,50,50,size,size,this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			size += 10;
		}else if(e.getSource()==bt2) {
			size-=10;
		}
		this.repaint();
		
	}
}
public class Ex03 {
	public static void main(String[] ar) {
		new Ex03_sub("����");
	}
}
;