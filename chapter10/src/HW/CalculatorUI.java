//계산기 UI 만들기

package HW;
import java.awt.*;
import javax.swing.*;
class CalculatorUI_sub extends JFrame{
	Button b1 = new Button("==");
	private Label lb1=new Label("표준 ",Label.LEFT);
	Button b2 = new Button("top");
	Button b3 = new Button("rec");
	private TextField idt=new TextField(600);
	private String[] btn_list1 = { "MC", "MR", "M+", "M-", "MS", "M*"};         
	private String[] btn_list2 = { "%", "CE", "C", "backsp", "1/x", "x^2", "sqrt", "/", "7",
	           "8", "9", "X", "4", "5", "6" , "-", "1", "2", "3", "+", "+/-" , "0" , "." , "="  };
	private GridLayout gl = new GridLayout(7,1);
	private GridLayout gl1 = new GridLayout(3,1);
	private GridLayout gl2 = new GridLayout(1,2);
	private GridLayout gl3 = new GridLayout(1,5);
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	private Panel p5 = new Panel();
	private Panel p6 = new Panel();
	private Panel p7 = new Panel();
	private Panel p8 = new Panel();
	private Panel p9 = new Panel();
	private Panel p10 = new Panel();
	private Panel p11 = new Panel();

		public CalculatorUI_sub(String title) {
			super(title);//제목을 가지는 프레임 생성을 할 수 있음.		
			super.setSize(400,650);
			
			this.init();
			
			Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
			Dimension frm=super.getSize();
			int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
			int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
			super.setLocation(x_pos,y_pos);
			
			super.setVisible(true);
			
		}
		public void init() {
			this.setLayout(gl);//(7,1)
			p1.setLayout(gl1);//(3,1)
			
			p1.add(p2);
			p2.setLayout(gl2);//(1,2)
			p2.add(p3);
	       
			p3.setLayout(new FlowLayout(FlowLayout.LEFT));
			p3.add(b1);//==
			p3.add(lb1);//표준
			p3.add(b2);//top
			
			p2.add(p4);
			p4.setLayout(new FlowLayout(FlowLayout.RIGHT));
			p4.add(b3);//rec
			
			p1.add(idt);//숫자패널
			p1.add(p5);
			
			p5.setLayout(gl3);//(1,5)
			for (int i = 0; i < btn_list1.length; i++) {

			       p5.add(new Button(btn_list1[i]));
				}
			this.add(p1);//"MC", "MR", "M+", "M-", "MS", "M*"

			p6.setLayout(new GridLayout(1,4));//(1,5)
			for (int i = 0; i < 4; i++) {

			       p6.add(new Button(btn_list2[i]));
				}
			this.add(p6);//"%", "CE", "C", "backsp"
			p7.setLayout(new GridLayout(1,4));//(1,5)
			for (int i = 4; i < 8; i++) {

			       p7.add(new Button(btn_list2[i]));
				}
			this.add(p7);//"1/x", "x^2", "sqrt", "/"
			p8.setLayout(new GridLayout(1,4));//(1,5)
			for (int i = 8; i < 12; i++) {

			       p8.add(new Button(btn_list2[i]));
				}
			this.add(p8);//"7","8", "9", "X"
			p9.setLayout(new GridLayout(1,4));//(1,5)
			for (int i = 12; i < 16; i++) {

			       p9.add(new Button(btn_list2[i]));
				}
			this.add(p9);//"4", "5", "6" , "-"
			p10.setLayout(new GridLayout(1,4));//(1,5)
			for (int i = 16; i < 20; i++) {

				p10.add(new Button(btn_list2[i]));
				}
			this.add(p10);//"1", "2", "3", "+"
			p11.setLayout(new GridLayout(1,4));//(1,5)
			for (int i = 20; i < 24; i++) {

				p11.add(new Button(btn_list2[i]));
				}
			this.add(p11);//"+/-" , "0" , "." , "="	
		}	
	}
	public class CalculatorUI {
		public static void main(String[] ar) {
			new CalculatorUI_sub("제목");
		}
	}
   