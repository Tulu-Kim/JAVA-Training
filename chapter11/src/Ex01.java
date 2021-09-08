//색상에 대한 예제
import java.awt.*;

class Ex01_sub extends Frame{
	private Color cc=new Color(20,0,234);// RGB
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
		//this.setBackground(Color.black);
		this.setBackground(cc);
	}
	
}
public class Ex01 {
	public static void main(String[] ar) {
		new Ex01_sub("제목");
	}
}
