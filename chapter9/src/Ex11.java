//paeㅜl()클래스
public class Ex11 {
	
}

import java.awt.*;
class Ex11sub extends Frame{
	private Button bt = new Button("확인");
	public Ex11sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
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
		Ex11sub ex=new Ex11sub("제목");
	}
}
