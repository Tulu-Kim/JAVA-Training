//������Ʈ�� �ø��� ���
import java.awt.*;

class Ex03_sub extends Frame{
	private Label lb=new Label("�ȳ��ϼ���?");//label�� ���� ������Ʈ
	public Ex03_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		super.setSize(500,300);
		this.init();//ȭ���ʱ�ȭ
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
	}	
	public void init() {
		this.add(lb);//���� ȭ�鿡 lb��� component�� �ϰ��϶��.
	}
}
public class Ex03{
	public static void main(String[] ar) {
		//Ex03_sub ex=
		new Ex03_sub("����");
	}
}
