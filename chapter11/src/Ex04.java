

import java.awt.*;

class Ex04_sub extends Frame{
	private Label blood_lb =new Label("혈액형은?");
	private Choice blood_ch=new Choice();
	
	private Label birth_lb = new Label("생년월일은?");
	private Choice year_ch=new Choice();
	private Label year_lb=new Label(" 년");
	private Choice month_ch=new Choice();
	private Label  month_lb=new Label(" 월");
	private Choice day_ch=new Choice();
	private Label  day_lb=new Label(" 일");
	
	private Label alpha_lb = new Label("알파벳목록!",Label.CENTER);
	private List alpha_li = new List(1,true);//리스트에서 다중선택이 가능하게 만드는 추가 옵션 적용
	
	//레이아웃 구성
	private BorderLayout bl = new BorderLayout();
	private Panel p =new Panel();
	private GridLayout gl = new GridLayout(4,1);
	
	private Panel p1=new Panel();
	private GridBagLayout gbl=new GridBagLayout();

	
	private Panel p2 = new Panel();
	private BorderLayout bl1 = new BorderLayout();
	
	
	
	public Ex04_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
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
		
		
		//Data Setting 작업을 진행한다.
		blood_ch.add("A형");
		blood_ch.add("B형");
		blood_ch.add("O형");
		blood_ch.add("AB형");
		
		//년도 데이터 셋팅 작업을 하자
		for(int i=2021;i>=1900;i-- ) {
			year_ch.add(String.valueOf(i));
		}
		for(int i=1;i<=12;++i) {
			month_ch.add(String.valueOf(i));
		}
		for(int i=1;i<=30;++i) {
			day_ch.add(String.valueOf(i));
		}
		
		//list에대한 알파벳 내용의 데이터
		for(char i ='A';i<='Z';++i) {
			String s=""+i+i+i;
			alpha_li.add(s);
		}
		this.add("Center",p);
		
		//센터영역이 끝난후에 East 영역을 채우는 내용
		p2.setLayout(bl1);
		p2.add("North",alpha_lb);
		p2.add("Center",alpha_li);
		this.add("East",p2);
		
		
		//센터명이 채워지는 부분
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
		new Ex04_sub("제목");
	}
}
