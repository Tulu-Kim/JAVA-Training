//������Ʈ �ΰ��� ����־ �ϲ� ��ġ�� ����ǰ���� ������ߵ�
//�̷��� �̿��ϴ� ���� �ǳ��̴�
import java.awt.*;
class Ex12_sub extends Frame{
	private Button bt = new Button("Ȯ��");
	private Button bt1 = new Button("���");
	private GridLayout g1=new GridLayout(1,2);
	
	public Ex12_sub(String title) {
		
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
		this.setLayout(g1);
		this.add(bt);
		this.add(bt1);
		
	}
}
public class Ex12 {
	public static void main(String[] ar) {
		Ex12_sub ex=new Ex12_sub("����");
	}
}
