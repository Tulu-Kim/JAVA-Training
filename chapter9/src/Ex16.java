//특정 컴포넌트에 색상을 힙히는경우 글자에 색상을 입혀보자
import java.awt.*;
class Ex16_sub extends Frame{
	private Color cc=new Color(20,0,234);// RGB
	private Color cc1=new Color(0,0,0);// RGB,검은색
	private Color cc2=new Color(255,255,255);// RGB 흰색
	private Color cc3=new Color(255,0,0);// RGB 빨간색
	
	private Button bt = new Button("확인");
	
	//디폴트로 화면 정중앙에 위치하도록 하려주는 레이아웃은 그리드 백레이아웃
	private GridBagLayout gbl = new GridBagLayout(); 
	
	public Ex16_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
		this.init();
		super.setSize(500,300);
		super.setVisible(true);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		super.setResizable(false);
		super.setVisible(true);
}
	public void init() {
		this.setBackground(cc);
		this.setLayout(gbl);
		bt.setBackground(cc1);
		//글자색상은?
		bt.setForeground(Color.WHITE);
		
		this.add(bt);
	}
}
public class Ex16 {
	public static void main(String[] ar) {
		new Ex16_sub("제목");
	}
}
