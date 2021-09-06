//frame을 만드는 방법
import java.awt.*;

public class Ex01 {
	public static void main(String[] ar) {
	Frame f = new Frame();
	Frame f1 = new Frame("자바");
	f.setSize(300,200);
	f1.setSize(400,300);
	//f.setVisible(true);
	//f1.setVisible(true);
	
	//화면의 정중앙에 배치할  수 있도록 ...
	Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	//폭과 높이를 관리하는 클래스
	//그다음 화면크기에 따른 각각의 프레임 크기를 나타냄ㄴ~
	Dimension f_size=f.getSize();
	Dimension f1_size=f1.getSize();
	
	int x_pos1=(int)(screen.getWidth()/2-f1_size.getWidth()/2);
	int y_pos1=(int)(screen.getHeight()/2-f1_size.getHeight()/2);
	f.setLocation(x_pos1,y_pos1);
	
	int x_pos=(int)(screen.getWidth()/2-f_size.getWidth()/2);
	int y_pos=(int)(screen.getHeight()/2-f_size.getHeight()/2);
	f.setLocation(x_pos,y_pos);
	
	f.setLocation(300,200);
	f1.setLocation(300,300);
	
	f.setVisible(true);
	f1.setVisible(true);

	}

}
