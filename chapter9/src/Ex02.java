//���߾ӿ� ��ġ�Ǵ� �������� ��ӹ޾Ƽ� ó���ϴ� ���

import java.awt.*;
class Ex02_sub extends Frame{
	public Ex02_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		super.setSize(500,300);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
	}
}
public class Ex02 {
	public static void main(String[] ar) {
		Ex02_sub ex=new Ex02_sub("����");
	}
}
