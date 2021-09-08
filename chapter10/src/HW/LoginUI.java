//로그인UI 만들기
package HW;
import java.awt.*;
import javax.swing.*;
class LoginUI_sub extends JFrame{
	
	private TextField idt=new TextField(35);
	private TextField pwt=new TextField(35);
	
	Button b1 = new Button("로그인");
	Button b2 = new Button("취소");
	Button b3 = new Button("회원가입");

	private Label lb1=new Label("ID ",Label.LEFT);
	private Label lb2=new Label("PW",Label.LEFT);
	
	private GridLayout gl = new GridLayout(4,1);
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	public LoginUI_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.		
		super.setSize(350,150);
		
		this.init();
		this.start();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
		
	}
	public void init() {
		this.setLayout(gl);
        p1.add(lb1);
		p1.add(idt);
        this.add(p1);
        
        p2.add(lb2);
		p2.add(pwt);
        this.add(p2);
        
        p3.add(b1);
        p3.add(b2);
        this.add(p3);
        
        p4.add(b3);
        this.add(p4);
        
        
	}
    public void start() {}
    

}
public class LoginUI {
	public static void main(String[] ar) {
		new LoginUI_sub("제목");
	}
}