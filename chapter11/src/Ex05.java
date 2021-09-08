//TextField & TextArea클래스에 대한 이야기임.

import java.awt.*;

class Ex05_sub extends Frame{
   //게시판을 생각하면 됨.
   private Label title_lb=new Label("제목:",Label.RIGHT);//1
   private TextField title_tf=new TextField();//2..이들을 north영역으로
   
   private TextArea contents_ta=new TextArea();//3..이를 센터영역에
   
   private Button bt=new Button("글등록");//4..이를 사우스영역으로
   private BorderLayout bl=new BorderLayout(10,10);//5
   
   //north영역에도 패널이 한개 필요함.
      private Panel p=new Panel();
      private BorderLayout bl1=new BorderLayout();
   
   //south 영역에 들어간내용은 우측정렬이 필요하여 패널이 필요함.
   private Panel p1=new Panel();
   private FlowLayout fl=new FlowLayout(FlowLayout.RIGHT);
      
   
   public Ex05_sub(String title) {
      super(title);//상위클래스의 생성자를 그대로 가져옴.
      
      this.init();
      super.setVisible(true);//상위클래스인Frame의 setVisible을 부름.
      //화면에 출력해보라~..
      //그다음으로  하면의 프레임의 크기로
      super.setSize(300,200);
      //그다음으로 화면의 정중앙배치를 위하여..
      //화면의 정중앙으로 2로나누어서 조정하면 됨.
      Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
      Dimension frm=super.getSize();//프레임의 크기
      
      //그래서 화면의 중앙으로의 작업은..
      int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2); //double형을 정수형인 형변환해야 됨.
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
      Ex05_sub ex=new Ex05_sub("제목");
   }

}