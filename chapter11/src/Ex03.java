
//Checkbox,ChackboxGroup
import java.awt.*;

class Ex03_sub extends Frame{
	
	private Label fr1_lb = new Label("좋아하는 과일은?");
	private Checkbox a_cb=new Checkbox("바나나");
	private Checkbox b_cb=new Checkbox("사과");
	private Checkbox c_cb=new Checkbox("배");

	private Label  sex_lb=new Label("당신의 성별은?");
	
	private CheckboxGroup cg=new CheckboxGroup();
	private Checkbox man_cb=new Checkbox("남성",cg,true);
	private Checkbox woman_cb=new Checkbox("여성",cg,false);
	
	//위의 내용들의  레이아웃을 
	private GridLayout gl =new GridLayout(4,1);
	private Panel p = new Panel();
	private GridLayout gl1 =new GridLayout(1,3);
	
	private Panel p1 = new  Panel();
    private GridLayout gl2 =new GridLayout(1,2);
	
	
	public Ex03_sub(String title) {
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
		this.setLayout(gl);
		this.add(fr1_lb);
		
		p.setLayout(gl1);
		p.add(a_cb);p.add(b_cb);p.add(c_cb);
		
		this.add(p);//
		
		this.add(sex_lb);
		p1.setLayout(gl2);
		p1.add(man_cb);p1.add(woman_cb);
		this.add(p1);
		
	}
	
}
public class Ex03 {
	public static void main(String[] ar) {
		new Ex03_sub("제목");
	}
}
