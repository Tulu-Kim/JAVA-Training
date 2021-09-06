//컴포넌트를 올리는 방법
import java.awt.*;

class Ex03_sub extends Frame{
	private Label lb=new Label("안녕하세요?");//label에 대한 컴포넌트
	public Ex03_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
		super.setSize(500,300);
		this.init();//화면초기화
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
	}	
	public void init() {
		this.add(lb);//현제 화면에 lb라는 component를 하가하라ㅣ.
	}
}
public class Ex03{
	public static void main(String[] ar) {
		//Ex03_sub ex=
		new Ex03_sub("제목");
	}
}
