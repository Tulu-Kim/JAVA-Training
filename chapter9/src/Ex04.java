//FlowLayout

import java.awt.*;
class Ex04_sub extends Frame{
	private Button bt1 = new Button("bt1");
	private Button bt2 = new Button("bt2");
	private Button bt3 = new Button("bt3");
	private Button bt4 = new Button("bt4");
	private Button bt5 = new Button("bt5");
	private Button bt6 = new Button("bt6");
	
	private FlowLayout f1 = new FlowLayout();
	
	public Ex04_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
		super.setSize(500,300);
		
		this.init();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
		super.setResizable(false);//크기 변경 불가
	}
	public void init() {
		this.setLayout(f1);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
	}
}
public class Ex04 {
	public static void main(String[] ar) {
		Ex04_sub ex=new Ex04_sub("제목");
	}
}
