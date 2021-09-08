import java.awt.*;

//��ȭ�� ���̾ƿ��� ����� ����

class Ex02_sub extends Frame{
	private Color cc=new Color(20,0,234);// RGB
	private Label lb =new Label("��ȭ��",Label.CENTER);
	//��ư�� 12�� ����
	private Button[] bt=new Button[12];
	private String[] str=new String[] {"*","0","#"};
	
	private BorderLayout bl=new BorderLayout(10,10);
	private Panel p = new Panel();
	private GridLayout g1 = new GridLayout(4,3,5,5);
	
	public Ex02_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		super.setSize(500,300);
		this.init();
		
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
		p.setLayout(g1);
		for(int i=0;i<bt.length;i++) {
			bt[i]=new Button(String.valueOf(i+1));
		//���⿡ Ư�����ڸ� �����ϰ��� ��.
			if(i>=9){
				bt[i]=new Button(str[i-9]);
			}
			p.add(bt[i]);
		}
		this.add("Center",p);
		
				
	}
	
}
public class Ex02 {
	public static void main(String[] ar) {
		new Ex02_sub("����");
	}
}
