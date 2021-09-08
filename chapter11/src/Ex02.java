import java.awt.*;

//전화가 레이아웃을 만드는 예쩨

class Ex02_sub extends Frame{
	private Color cc=new Color(20,0,234);// RGB
	private Label lb =new Label("전화기",Label.CENTER);
	//버튼을 12개 만듬
	private Button[] bt=new Button[12];
	private String[] str=new String[] {"*","0","#"};
	
	private BorderLayout bl=new BorderLayout(10,10);
	private Panel p = new Panel();
	private GridLayout g1 = new GridLayout(4,3,5,5);
	
	public Ex02_sub(String title) {
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
		this.add("North",lb);
		p.setLayout(g1);
		for(int i=0;i<bt.length;i++) {
			bt[i]=new Button(String.valueOf(i+1));
		//여기에 특수문자를 도입하고자 함.
			if(i>=9){
				bt[i]=new Button(str[i-9]);
			}
			p.add(bt[i]);
		}
		this.add("Center",p);
		
				
	}
	
}
public class Ex02 {
	public static void main(String[] ar) {
		new Ex02_sub("제목");
	}
}
