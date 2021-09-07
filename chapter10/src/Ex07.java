//KeyAdapter, Listener,focusAdapter,FocusListener,ItemListener
import java.awt.*;
import java.awt.event.*;

class Ex07_sub extends Frame implements 
FocusListener,KeyListener,ItemListener{
	private TextField tf1=new TextField();
	private TextField tf2=new TextField();
	private Label lb1=new Label("NONe :",Label.RIGHT);
	private Label lb2=new Label("NONE");
	private Label lb3=new Label("NONE");
	private Choice ch=new Choice();
	
	private GridLayout gl = new GridLayout(4,1);
	private Panel p1 = new Panel();
	private GridLayout gl1 = new GridLayout(1,2,5,5);
	private Panel p2 = new Panel();
	private GridLayout gl2 = new GridLayout(1,2,5,5);
	
	
	public Ex07_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.		
		super.setSize(250,120);
		
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
		p1.setLayout(gl1);
		p1.add(tf1);
		p1.add(tf2);
		this.add(p1);
		
		p2.setLayout(gl2);
		p2.add(lb1);
		p2.add(lb2);
		this.add(p2);
		
		ch.add("NOEN");
		for(char c='A';c<'Z';c++) {
			String str=""+c+c+c;
			ch.add(str);
		}
		this.add(ch);
		this.add(lb3);
	}
	public void start() {
		tf1.addFocusListener(this);
		tf2.addFocusListener(this);
		
		tf1.addKeyListener(this);
		tf2.addKeyListener(this);
		
		ch.addItemListener(this);
		
	}
	//FocusListener의 재정의부 메소드
	@Override
	public void focusGained(FocusEvent e) {
		if(e.getSource()==tf1) {
			lb1.setText("첫번째 TextField위치");
		}
		else if(e.getSource()==tf2){
			lb1.setText("두번째 TextField위치");
		}
		
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
	//KeyListener 메소드의  재정의부
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getSource()==tf1) {
			int cnt=tf1.getText().trim().length();
			lb2.setText(cnt+"개");
		}
		else if(e.getSource()==tf2) {
			int cnt=tf2.getText().trim().length();
			lb2.setText(cnt+"개");
		}
	}
	//ItemListener 메소드의 재정의부
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==ch) {
			String str=ch.getSelectedItem();
			lb3.setText("선택된 내용 ="+str);
		}
		
	}
}

public class Ex07 {
	public static void main(String[] ar) {
		new Ex07_sub("제목");
	}
}
