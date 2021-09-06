// BorderLayout
import java.awt.*;
class Ex06_sub extends Frame{
	
		private Button bt1 = new Button("bt1");
		private Button bt2 = new Button("bt2");
		private Button bt3 = new Button("bt3");
		private Button bt4 = new Button("bt4");
		private Button bt5 = new Button("bt5");
		
		private BorderLayout b1 = new BorderLayout(30,20);
		
		public Ex06_sub(String title) {
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
		public void init(){
			this.setLayout(b1);
			this.add("North",bt1);
			this.add("West",bt2);
			this.add("Center",bt3);
			this.add("East",bt4);
			this.add("South",bt5);
		
		}
}

public class Ex06 {
	public static void main(String[] ar) {
		Ex06_sub ex=new Ex06_sub("제목");
	}
}
