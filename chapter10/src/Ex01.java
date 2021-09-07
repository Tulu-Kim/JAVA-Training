//버튼 하나를 컴포넌트로 구성하여 이를 클릭하게 되면 빠져나오는 이벤트 처리 방법
import java.awt.*;
import java.awt.event.*;

class Ex01_sub extends Frame{
	private Button bt =new Button("확인");
	private GridBagLayout gbl=new GridBagLayout();
	
	public Ex01_sub(String title) {
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
		A ap=new A();
		bt.addActionListener(ap);
	}
}
public class Ex01 {
	public static void main(String[] ar) {
		new Ex01_sub("제목");
	}
}

class A implements ActionListener{
	//public void aaa() {
	//	System.exit(0);
	//}
	public void actionPerformed(ActionEvent e) {
		//A라는 클래스가 호추뢰었을때 자동으로 
		//호출되도록 약속되어진 메소드임.
		System.exit(0);
	}
}