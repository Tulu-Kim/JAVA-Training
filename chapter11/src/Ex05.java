//TextField & TextAreaŬ������ ���� �̾߱���.

import java.awt.*;

class Ex05_sub extends Frame{
   //�Խ����� �����ϸ� ��.
   private Label title_lb=new Label("����:",Label.RIGHT);//1
   private TextField title_tf=new TextField();//2..�̵��� north��������
   
   private TextArea contents_ta=new TextArea();//3..�̸� ���Ϳ�����
   
   private Button bt=new Button("�۵��");//4..�̸� ��콺��������
   private BorderLayout bl=new BorderLayout(10,10);//5
   
   //north�������� �г��� �Ѱ� �ʿ���.
      private Panel p=new Panel();
      private BorderLayout bl1=new BorderLayout();
   
   //south ������ �������� ���������� �ʿ��Ͽ� �г��� �ʿ���.
   private Panel p1=new Panel();
   private FlowLayout fl=new FlowLayout(FlowLayout.RIGHT);
      
   
   public Ex05_sub(String title) {
      super(title);//����Ŭ������ �����ڸ� �״�� ������.
      
      this.init();
      super.setVisible(true);//����Ŭ������Frame�� setVisible�� �θ�.
      //ȭ�鿡 ����غ���~..
      //�״�������  �ϸ��� �������� ũ���
      super.setSize(300,200);
      //�״������� ȭ���� ���߾ӹ�ġ�� ���Ͽ�..
      //ȭ���� ���߾����� 2�γ���� �����ϸ� ��.
      Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
      Dimension frm=super.getSize();//�������� ũ��
      
      //�׷��� ȭ���� �߾������� �۾���..
      int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2); //double���� �������� ����ȯ�ؾ� ��.
      int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
      super.setLocation(xpos,ypos);
      super.setResizable(false);
      super.setVisible(true);
      
      
   }
   public void init() {
      this.setLayout(bl);//1
      p.setLayout(bl1);//5
      p.add("West",title_lb);//6
      p.add("Center",title_tf);//7
            
      this.add("North",p);//2
      
      this.add("Center",contents_ta);//3
      
      p1.setLayout(fl);
      p1.add(bt);
      
      this.add("South",p1);//4
      
      
   }
   
}
public class Ex05 {
   public static void main(String[] ar) {
      Ex05_sub ex=new Ex05_sub("����");
   }

}