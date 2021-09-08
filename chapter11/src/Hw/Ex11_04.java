package Hw;
import javax.swing.*;
import java.awt.*;

public class Ex11_04 extends JFrame{
	public Ex11_04() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//이미지 체크박스에 사용할 2개의 미지기 객체 생성
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("imgaes/selectedCherry.jpg");
		
		
		
		
		//3개의 체크박스 생성
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배",true);
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);

		//컨텐트팬에 3개의 체크박스 부착
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);

	}
	public static void main(String[] args) {
		new Ex11_04();
	}

}
