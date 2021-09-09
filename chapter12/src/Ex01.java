//그래픽의 프로세스
import java.awt.*;


class Ex01_sub extends Frame{
	private Button bt = new Button("확인");
	private BorderLayout bl= new BorderLayout();	
	public Ex01_sub(String title) {
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
		this.add("North",bt);
	}
	public void update(Graphics g) {
		g.clearRect(0, 0, 300, 200);
		paint(g);
	}
	public void paint(Graphics g) {
	g.drawLine(50,50,100,100);
}
}
public class Ex01 {
	public static void main(String[] ar) {
		new Ex01_sub("제목");
	}
}
