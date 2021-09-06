//정중앙에 대치되는 프레임을 상속받아서 처리하는 방법

import java.awt.*;
class Ex02_sub extends Frame{
	public Ex02_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
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
		Ex02_sub ex=new Ex02_sub("제목");
	}
}
