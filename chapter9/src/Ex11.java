//pae��l()Ŭ����
public class Ex11 {
	
}

import java.awt.*;
class Ex11sub extends Frame{
	private Button bt = new Button("Ȯ��");
	public Ex11sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		this.init();
		super.setSize(500,300);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		super.setResizable(false);
		super.setVisible(true);
	}
	public void init() {
		this.
	}
}
public class Ex11 {
	public static void main(String[] ar) {
		Ex11sub ex=new Ex11sub("����");
	}
}
