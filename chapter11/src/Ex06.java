//Dialog & FileDialogd�� ���� �̾߱�
import java.awt.*;

class Ex06_sub extends Frame{
	private Dialog dlg = new Dialog(this,"���",false);//(this."���",true)
	//�� ���̾�α״� ���������� �۵�X, �������̳� �ٸ� applet�� ���������� �۵���
	
	private Label msglb = new Label("����մϴ�.",Label.CENTER);
	private Button bt_ok = new Button("ok");
	
	//dlg ���̾ƿ� �ʿ�
	private BorderLayout bl =new BorderLayout();
	//South ������ �߾ӹ�ġ�� �ο�, �г��ʿ�
	private Panel p=new Panel();
	private GridBagLayout gbl = new GridBagLayout();
	
	public Ex06_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		super.setSize(500,300);
		this.init();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
		
		dlg.setLocation(300,200);
		dlg.setSize(100,150);
		dlg.setVisible(true);
		
	}
	public void init() {
		dlg.setLayout(bl);
		dlg.add("Center",msglb);
		
		p.setLayout(gbl);
		p.add(bt_ok);
		dlg.add("South",p);
	}
	
}
public class Ex06 {
	public static void main(String[] ar) {
		new Ex06_sub("����");
	}
}
