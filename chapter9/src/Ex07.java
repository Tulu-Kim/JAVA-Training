//CardLayout()
//�⺻��
import java.awt.*;
class Ex07_sub extends Frame{
	
		private Button bt1 = new Button("bt1");
		private Button bt2 = new Button("bt2");
		private Button bt3 = new Button("bt3");
	
     	private CardLayout cl = new CardLayout();
		
		public Ex07_sub(String title) {
		   super(title);//������ ������ ������ ������ �� �� ����.
		   super.setSize(500,300);
		   
		   this.init();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
		//ȭ���ġ�� ������ �ֱ⶧���� ���ݽð��� �ΰ� ���̱⸦ ���Ѵٸ�...
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		cl.show(this, "bb");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		cl.show(this, "cc");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		cl.show(this, "aa");
	}
		public void init(){
			this.setLayout(cl);
			this.add("aa",bt1);
			this.add("bb",bt2);
			this.add("cc",bt3);
			
		
		}
}

public class Ex07 {
	public static void main(String[] ar) {
		Ex07_sub ex=new Ex07_sub("����");
	}
}
