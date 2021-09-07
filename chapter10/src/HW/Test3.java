package HW;

import java.awt.*;
import javax.swing.*;
class Test3_sub extends JFrame{
	private TextField tf1 = new TextField("0",30);
	private Label lb1 = new Label("표준 ",Label.LEFT);
	private Label lb2 = new Label("P/W",Label.LEFT);
	private Button bt1 = new Button("==");
	private Button topBt = new Button("top");
	private Button recBt = new Button("rec");
	private Button mcBt = new Button("MC");
	private Button mrBt = new Button("MR");
	private Button mpBt = new Button("M+");
	private Button mmBt = new Button("M-");
	private Button msBt = new Button("MS");
	private Button mmuBt = new Button("M*");
	private Button perBt = new Button("%");
	private Button ceBt = new Button("CE");
	private Button cBt = new Button("C");
	private Button backBt = new Button("backsp");
	private Button fBt = new Button("1/x");
	private Button squBt = new Button("x^2");
	private Button sqrtBt = new Button("sqrt");
	private Button divBt = new Button("/");
	private Button muBt = new Button("X");
	private Button mBt = new Button("-");
	private Button pBt = new Button("+");
	private Button resBt = new Button("=");
	private Button pointBt = new Button(".");
	private Button pmBt = new Button("+/-");
	
	private GridLayout gl1 = new GridLayout(1,2);
	private GridLayout gl3 = new GridLayout(1,6);
	private GridLayout gl4 = new GridLayout(6,4);
	private Panel p = new Panel();
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	private Panel p5 = new Panel();
	
	public Test3_sub(String title) {
		super(title); 
		super.setSize(500,500);
		this.init(); 
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = super.getSize();
		int x_pos = (int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos = (int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos, y_pos);
		
		super.setVisible(true);
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		p1.setLayout(gl1);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		p2.add(bt1);
		p2.add(lb1);
		p2.add(topBt);
		p1.add(p2);
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p3.add(recBt);
		p1.add(p3);
		this.add(p1);
		
		this.add(tf1);
		
		p4.setLayout(gl3);
		p4.add(mcBt);
		p4.add(mrBt);
		p4.add(mpBt);
		p4.add(mmBt);
		p4.add(msBt);
		p4.add(mmuBt);
		this.add(p4);
		p.setLayout(new GridLayout(3,1));
		p.add(p1);
		p.add(tf1);
		p.add(p4);
		
		Button bt[] = new Button[10];
		for(int i=0; i<=9; i++) {
			String txt = Integer.toString(i); 
			bt[i] = new Button(txt);
		}
		
		p5.setLayout(gl4);
		p5.add(perBt);
		p5.add(ceBt);
		p5.add(cBt);
		p5.add(backBt);
		p5.add(fBt);
		p5.add(squBt);
		p5.add(sqrtBt);
		p5.add(divBt);
		p5.add(bt[7]);
		p5.add(bt[8]);
		p5.add(bt[9]);
		p5.add(muBt);
		p5.add(bt[4]);
		p5.add(bt[5]);
		p5.add(bt[6]);
		p5.add(mBt);
		p5.add(bt[1]);
		p5.add(bt[2]);
		p5.add(bt[3]);
		p5.add(pBt);
		p5.add(pmBt);
		p5.add(bt[0]);
		p5.add(pointBt);
		p5.add(resBt);
		
		this.add("North",p);
		this.add("Center",p5);
	}
	

}
public class Test3 {
	public static void main(String[] args) {
		new Test3_sub("계산기");
	}
}
