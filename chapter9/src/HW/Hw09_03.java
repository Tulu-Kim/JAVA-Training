//Hw3
package HW;
import java.awt.*;

class Hw09_03usb extends Frame{
	private Button yse_bt = new Button("확인");
	private Button no1_bt = new Button("취소");
	private Button no2_bt = new Button("무시");
	
	Panel p = new Panel();
	Panel p1 = new Panel();
	
	
	private BorderLayout bl = new BorderLayout();
	private GridLayout gl = new GridLayout(1,3);
	
	
	public Hw09_03usb(String title) {
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
		p.setLayout(gl);
		p.add(yse_bt);
		p.add(no1_bt);
		p.add(no2_bt);
		this.add("West",p);
	}
}
public class Hw09_03 {
	public static void main(String[] ar) {
		new Hw09_03usb("제목");
	}
}