

import java.awt.*;

class Ex04_sub extends Frame{
	private Label blood_lb =new Label("��������?");
	private Choice blood_ch=new Choice();
	
	private Label birth_lb = new Label("���������?");
	private Choice year_ch=new Choice();
	private Label year_lb=new Label(" ��");
	private Choice month_ch=new Choice();
	private Label  month_lb=new Label(" ��");
	private Choice day_ch=new Choice();
	private Label  day_lb=new Label(" ��");
	
	private Label alpha_lb = new Label("���ĺ����!",Label.CENTER);
	private List alpha_li = new List(1,true);//����Ʈ���� ���߼����� �����ϰ� ����� �߰� �ɼ� ����
	
	//���̾ƿ� ����
	private BorderLayout bl = new BorderLayout();
	private Panel p =new Panel();
	private GridLayout gl = new GridLayout(4,1);
	
	private Panel p1=new Panel();
	private GridBagLayout gbl=new GridBagLayout();

	
	private Panel p2 = new Panel();
	private BorderLayout bl1 = new BorderLayout();
	
	
	
	public Ex04_sub(String title) {
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
		
		
		//Data Setting �۾��� �����Ѵ�.
		blood_ch.add("A��");
		blood_ch.add("B��");
		blood_ch.add("O��");
		blood_ch.add("AB��");
		
		//�⵵ ������ ���� �۾��� ����
		for(int i=2021;i>=1900;i-- ) {
			year_ch.add(String.valueOf(i));
		}
		for(int i=1;i<=12;++i) {
			month_ch.add(String.valueOf(i));
		}
		for(int i=1;i<=30;++i) {
			day_ch.add(String.valueOf(i));
		}
		
		//list������ ���ĺ� ������ ������
		for(char i ='A';i<='Z';++i) {
			String s=""+i+i+i;
			alpha_li.add(s);
		}
		this.add("Center",p);
		
		//���Ϳ����� �����Ŀ� East ������ ä��� ����
		p2.setLayout(bl1);
		p2.add("North",alpha_lb);
		p2.add("Center",alpha_li);
		this.add("East",p2);
		
		
		//���͸��� ä������ �κ�
		p1.setLayout(gbl);
		p1.add(year_ch);p1.add(year_lb);
		p1.add(month_ch);p1.add(month_lb);
		p1.add(day_ch);p1.add(day_lb);
		
		p.setLayout(gl);
		p.add(blood_lb);p.add(blood_ch);
		p.add(birth_lb);p.add(p1);
		
		
		
		
		
	}
	
}
public class Ex04 {
	public static void main(String[] ar) {
		new Ex04_sub("����");
	}
}
