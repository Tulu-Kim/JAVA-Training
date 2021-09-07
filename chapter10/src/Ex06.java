//MouseAdapter와 MouseListener에 대한 이벤트 처리방법
import java.awt.*;
import java.awt.event.*;

class Ex06_sub extends Frame implements 
MouseListener,MouseMotionListener{
	private Label lb = new Label("x=000,y=000");
	private Button bt =new Button("확인");
	
	private BorderLayout bl=new BorderLayout();
	
	public Ex06_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
		super.setSize(500,300);
		this.init();//화면초기화
		this.start();//추가되는 이벤트의 내용
		
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
		this.add("South",bt);
		
	}
	public void start() {//버튼과 클래스 A를 매칭 시켜준다
		bt.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt) {
			bt.setLabel("버튼위에 마우스가 있네요");
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==bt) {
			bt.setLabel("확인");
		}
		
	}
	//MouseMotion의 재정의부 메소드
	@Override
	public void mouseDragged(MouseEvent e) {
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		if(e.getSource()==this) {
			//만약에 이 내용이 this상태에서 발생이 됬다면
			int x=e.getX();
			int y=e.getY();
			lb.setText("x="+x+"y="+y);
		}
		
	}
}
public class Ex06 {
	public static void main(String[] ar) {
		new Ex06_sub("제목");
	}
}

