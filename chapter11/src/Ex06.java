//Dialog & FileDialogd의 대한 이야기
import java.awt.*;

class Ex06_sub extends Frame{
	private Dialog dlg = new Dialog(this,"경고",false);//(this."경고",true)
	//이 다이얼로그는 독립적으로 작동X, 프레임이나 다른 applet에 의존적으로 작동함
	
	private Label msglb = new Label("경고합니다.",Label.CENTER);
	private Button bt_ok = new Button("ok");
	
	//dlg 레이아웃 필요
	private BorderLayout bl =new BorderLayout();
	//South 영역에 중앙배치가 핑요, 패널필요
	private Panel p=new Panel();
	private GridBagLayout gbl = new GridBagLayout();
	
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
		
		dlg.setLocation(300,200);
		dlg.setSize(100,150);
		dlg.setVisible(true);
		
	}
	public void init() {
		dlg.setLayout(bl);
		dlg.add("Center",msglb);
		
		p.setLayout(gbl);
		p.add(bt_ok);
		dlg.add("South",p);
	}
	
}
public class Ex06 {
	public static void main(String[] ar) {
		new Ex06_sub("제목");
	}
}
