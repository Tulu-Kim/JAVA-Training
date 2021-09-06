//Jframe 에서 구성될 수 있는 배치

import javax.swing.*;
import java.awt.*;

public class Ex09 extends JFrame{
	public Ex09() {
		setTitle("스윙프레임구성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=getContentPane();//컨텐드팬의 내용을 자동적으로 알려주는 기능 메소드
		cp.setBackground(Color.ORANGE);
		cp.setLayout(new FlowLayout());//컨텐트팬에  FlowLayout배치 관리자 달기/
		
		cp.add(new JButton("ok"));
		cp.add(new JButton("Cancel"));
		cp.add(new JButton("Ignoer"));
		
		setSize(300,300);
		setVisible(true);

	}
	public static void main(String[] ar){
		 Ex09 src = new Ex09();
	}

}
