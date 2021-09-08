
//계산기 UI 만들기
package HW;
import java.awt.*;
import javax.swing.*;
class Test2_sub extends JFrame{
	Button b1 = new Button("==");
	private Label lb1=new Label("표준 ",Label.LEFT);
	Button b2 = new Button("top");
	Button b3 = new Button("rec");
	
	Button bt1 = new Button("AAA");
	Button bt1e = new Button("BBB");
	Button bt2 = new Button("CCC");
	Button bt2e = new Button("DDD");
	Button bt3 = new Button("EEE");
	Button bt3e = new Button("FFF");
	
	
	private TextField idt=new TextField(2);
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

	JButton[] jbtn = new JButton[5]; 
	public Test2_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.		
		super.setSize(400,650);
		
		this.init();
		
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		pack();
		super.setVisible(true);
		
	}
	
	GridBagLayout gbl = new GridBagLayout();
    
    //위치를 조정할 수있는 레이아웃 구조를 불러와야됨
    private GridBagConstraints gc = new GridBagConstraints();
	
		
    	public void init(){
			this.setLayout(gbl);
			gc.gridx=0;
			gc.gridy=0;
			gc.gridwidth=1;
			gc.gridheight=2;
			gbl.setConstraints(p1,gc);//현제의 bt1을 gc의 위치내용대로 표시하겠단,내용
			p1.setLayout(new GridLayout(1,2));
			p1.add(p2);
			p2.setLayout(new FlowLayout(FlowLayout.LEFT));
			p2.add(bt1);
			p2.add(bt1e);
			this.add(p1);	
			
			gc.gridx=0;
			gc.gridy=3;
			gc.gridwidth=8;
			gc.gridheight=1;
			gbl.setConstraints(p3,gc);//현제의 bt1을 gc의 위치내용대로 표시하겠단,내용
			p3.setLayout(new FlowLayout(FlowLayout.LEFT));
			p3.add(idt);
			this.add(p3);
			
			gc.gridx=0;
			gc.gridy=5;
			gc.gridwidth=6;
			gc.gridheight=2;
			gbl.setConstraints(p4,gc);//현제의 bt1을 gc의 위치내용대로 표시하겠단,내용
			p4.setLayout(new GridLayout(1,5));
			for (int i = 0; i < btn_list1.length; i++) {

			       p4.add(new Button(btn_list1[i]));
				}
			this.add(p4);
			
			gc.gridx=0;
			gc.gridy=7;
			gc.gridwidth=6;
			gc.gridheight=24;
			gbl.setConstraints(bt3e,gc);//현제의 bt1을 gc의 위치내용대로 표시하겠단,내용
	        this.add(bt3e);
	        
			
			
			
		
			
			/*gc.gridx=1;
			gc.gridy=3;
			gc.gridwidth=2;
			gc.gridheight=18;
			gbl.setConstraints(p3,gc);//현제의 bt1을 gc의 위치내용대로 표시하겠단,내용
			p3.setLayout(new GridLayout(1,2));
			p3.add(bt3);
			p3.add(bt3e);
			this.add(p3);*/
		
		
		
		/*this.setLayout(gl);//(7,1)
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
		//p1.add(p4);
		//p4.setLayout(gl3);
		p1.add(p5);
		
		p5.setLayout(gl3);//(1,5)
		for (int i = 0; i < btn_list1.length; i++) {

		       p5.add(new Button(btn_list1[i]));
			}
		this.add(p1);//"MC", "MR", "M+", "M-", "MS", "M*"*/


		
	}	
}
public class Test2 {
	public static void main(String[] ar) {
		new Test2_sub("제목");
	}
}