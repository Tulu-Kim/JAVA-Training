//��ư �ϳ��� ������Ʈ�� �����Ͽ� �̸� Ŭ���ϰ� �Ǹ� ���������� �̺�Ʈ ó�� ���
import java.awt.*;
import java.awt.event.*;

class Ex01_sub extends Frame{
	private Button bt =new Button("Ȯ��");
	private GridBagLayout gbl=new GridBagLayout();
	
	public Ex01_sub(String title) {
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
		A ap=new A();
		bt.addActionListener(ap);
	}
}
public class Ex01 {
	public static void main(String[] ar) {
		new Ex01_sub("����");
	}
}

class A implements ActionListener{
	//public void aaa() {
	//	System.exit(0);
	//}
	public void actionPerformed(ActionEvent e) {
		//A��� Ŭ������ ȣ�߷ھ����� �ڵ����� 
		//ȣ��ǵ��� ��ӵǾ��� �޼ҵ���.
		System.exit(0);
	}
}