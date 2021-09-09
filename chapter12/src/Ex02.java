//버튼을 누를새 자동으로 랜섬하게 선이 그러지는 ㅡㅍ로개름

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
class Ex02_sub extends Frame implements ActionListener {
	private Button bt = new Button("확인");
	private BorderLayout bl= new BorderLayout();	
	public Ex02_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
		super.setSize(500,300);
		this.init();
		this.start();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		super.setResizable(true);
		
		super.setVisible(true);
		
	}
	public void init() {
		this.setLayout(bl);
		this.add("North",bt);
	}
	public void start() {
		bt.addActionListener(this);
	}
	//public void update(Graphics g) {}
	public void paint(Graphics g) {
		int x = (int)(Math.random()*200);
		int y = (int)(Math.random()*300);
		g.drawLine(x,x,y,y);
     }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt) {
			this.repaint();
		}
		
	}
	}

public class Ex02 {
	public static void main(String[] ar) {
		new Ex02_sub("제목");
	}
}
