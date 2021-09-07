//Frame 클레스 내에 Listener를 구현하는 법
//도다른 클래스의 생성 없이 하나의 클래서에서 이벤트 처리를 완료하자.

import java.awt.*;
import java.awt.event.*;

class Ex04_sub extends Frame{
	private Button bt =new Button("확인");
	private GridBagLayout gbl=new GridBagLayout();
	
	public Ex04_sub(String title) {
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
		this.setLayout(gbl);
		this.add(bt);
		
	}
	public void start() {//버튼과 클래스 A를 매칭 시켜준다
	
		bt.addMouseListener(this);
	}
}
public class Ex04 {
	public static void main(String[] ar) {
		new Ex01_sub("제목");
	}
}

class AAA implements MouseListener{
	//public void aaa() {
	//	System.exit(0);
	//}
	public void mouseClicked(MouseEvent e) {
		//A라는 클래스가 호추뢰었을때 자동으로 
		//호출되도록 약속되어진 메소드임.
		System.exit(0);
	}
}