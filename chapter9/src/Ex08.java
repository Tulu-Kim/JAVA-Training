//GridBagLayout()
//dnlclfmf ���Ǵ�� ���Ҽ� ����ư ��ü
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
        
        //��ġ�� ������ ���ִ� ���̾ƿ� ������ �ҷ��;ߵ�
        private GridBagConstraints gc = new GridBagConstraints();
        //��ġ ���� ����

        public Ex08_sub(String title) {
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
		public void init(){
			this.setLayout(gbl);
			gc.gridx=0;
			gc.gridy=0;
			gbl.setConstraints(bt1, gc);//������ bt1�� gc�� ��ġ������ ǥ���ϰڴ�,����
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
		Ex08_sub ex=new Ex08_sub("����");
	}
}