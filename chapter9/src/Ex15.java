//�����ο� ������ ����ִ� ���?
import java.awt.*;
class Ex15_sub extends Frame{
	private Color cc=new Color(20,0,234);// RGB
	public Ex15_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		this.init();
		super.setSize(500,300);
		super.setVisible(true);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		
	}
	public void init() {
		this.setBackground(Color.black);
		this.setBackground(cc);
	}
}
public class Ex15 {
	public static void main(String[] ar) {
		new Ex15_sub("����");
	}
}
