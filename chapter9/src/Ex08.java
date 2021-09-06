//GridBagLayout()
//dnlclfmf 임의대로 정할수 이하튼 객체
import java.awt.*;
class Ex08_sub extends Frame{
	
		private Button bt1 = new Button("AAA");
		private Button bt2 = new Button("BBB");
		private Button bt3 = new Button("CCC");
		private Button bt4 = new Button("DDD");
		private Button bt5 = new Button("EEE");
		private Button bt6 = new Button("FFF");
		private Button bt7 = new Button("GGG");

	
        GridBagLayout gbl = new GridBagLayout();
        
        //위치를 조정할 수있는 레이아웃 구조를 불러와야됨
        private GridBagConstraints gc = new GridBagConstraints();
        //위치 조정 가능

        public Ex08_sub(String title) {
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
		public void init(){
			this.setLayout(gbl);
			gc.gridx=0;
			gc.gridy=0;
			gbl.setConstraints(bt1, gc);//현제의 bt1을 gc의 위치내용대로 표시하겠단,내용
			this.add(bt1);
			
			gc.gridx=1;
			gc.gridy=1;
			gbl.setConstraints(bt2, gc);
			this.add(bt2);

			gc.gridx=2;
			gc.gridy=2;
			gbl.setConstraints(bt3, gc);
			this.add(bt3);

			gc.gridx=3;
			gc.gridy=3;
			gbl.setConstraints(bt4, gc);
			this.add(bt4);

			gc.gridx=3;
			gc.gridy=1;
			gbl.setConstraints(bt5, gc);
			this.add(bt5);

			gc.gridx=5;
			gc.gridy=5;
			gbl.setConstraints(bt6, gc);
			this.add(bt6);

			gc.gridx=6;
			gc.gridy=6;
			gbl.setConstraints(bt7, gc);
			this.add(bt7);

		}
}

public class Ex08 {
	public static void main(String[] ar) {
		Ex08_sub ex=new Ex08_sub("제목");
	}
}