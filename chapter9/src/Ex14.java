//Panel()�� ���� �߰�����
import java.awt.*;

class Ex14_sub extends Frame{
	private Button yse_bt = new Button("Ȯ��");
	private Button no1_bt = new Button("���1");
	private Button no2_bt = new Button("���2");
	
	Panel p = new Panel();
	Panel p1 = new Panel();
	
	
	private BorderLayout bl = new BorderLayout();
	private GridLayout gl = new GridLayout(1,2);
	private GridLayout gl1 = new GridLayout(2,1); 
	
	public Ex14_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		super.setSize(500,300);
		this.init();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
	}
	public void init() {
		this.setLayout(bl);
		p.add(yse_bt);
		p1.setLayout(gl1);
		p1.add(no1_bt);
		p1.add(no2_bt);
		
		p.add(p1);
		this.add("South",p);
	}
}
public class Ex14 {
	public static void main(String[] ar) {
		new Ex14_sub("����");
	}
}
