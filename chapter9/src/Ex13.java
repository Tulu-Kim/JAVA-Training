//Panel 대한 설계 내용

import java.awt.*;
class Ex13sub extends Frame{
	private Button yes_bt = new Button("확인");
	private Button no_bt = new Button("취소");
	
	private Panel p = new Panel();
	private BorderLayout bl = new BorderLayout();
	private GridLayout gl = new GridLayout(1,2);
	public Ex13sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
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
		this.setLayout(bl);
		p.add(yes_bt);
		p.add(no_bt);
		this.add("South",p);
		
	}
}
public class Ex13{
	public static void main(String[] ar) {
		new Ex13sub("제목");
	}
}
