//Ư�� ������Ʈ�� ������ �����°�� ���ڿ� ������ ��������
import java.awt.*;
class Ex16_sub extends Frame{
	private Color cc=new Color(20,0,234);// RGB
	private Color cc1=new Color(0,0,0);// RGB,������
	private Color cc2=new Color(255,255,255);// RGB ���
	private Color cc3=new Color(255,0,0);// RGB ������
	
	private Button bt = new Button("Ȯ��");
	
	//����Ʈ�� ȭ�� ���߾ӿ� ��ġ�ϵ��� �Ϸ��ִ� ���̾ƿ��� �׸��� �鷹�̾ƿ�
	private GridBagLayout gbl = new GridBagLayout(); 
	
	public Ex16_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		this.init();
		super.setSize(500,300);
		super.setVisible(true);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		super.setResizable(false);
		super.setVisible(true);
}
	public void init() {
		this.setBackground(cc);
		this.setLayout(gbl);
		bt.setBackground(cc1);
		//���ڻ�����?
		bt.setForeground(Color.WHITE);
		
		this.add(bt);
	}
}
public class Ex16 {
	public static void main(String[] ar) {
		new Ex16_sub("����");
	}
}
