package HW;
import java.awt.*;
import javax.swing.*;

class CalculatorUI_sub extends JFrame{
	Button b1 = new Button("==");
	private Label lb1=new Label("표준 ",Label.LEFT);
	Button b2 = new Button("top");
	Button b3 = new Button("rec");
	private TextField idt=new TextField(80);
	private String[] btn_list1 = { "%", "CE", "C", "backsp", "1/x", "x^2"};         
	private String[] btn_list2 = { "%", "CE", "C", "backsp", "1/x", "x^2", "sqrt", "/", "7",
            "8", "9", "X", "4", "5", "6" , "-", "1", "2", "3", "+", "+/-" , "0" , "." , "="  };
	private GridLayout gl = new GridLayout(7,1);
	private GridLayout gl1 = new GridLayout(3,1);
	private GridLayout gl2 = new GridLayout(1,2);
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	JButton[] jbtn = new JButton[5]; 
	public CalculatorUI_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.		
		super.setSize(600,800);
		
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
		p1.setLayout(gl2);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		p2.add(b1);
		p2.add(lb1);
		p2.add(b2);
	    p1.add(p2);
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p3.add(b3);
		p1.add(p3);
		this.add(p1);
		
	p2.add(idt);
	for (int i = 0; i < btn_list1.length; i++) {

       this.add(new JButton(btn_list1[i]));
	}
	
		
		
	}
    public void start() {}
    

}
public class CalculatorUI {
	public static void main(String[] ar) {
		new CalculatorUI_sub("제목");
	}
}