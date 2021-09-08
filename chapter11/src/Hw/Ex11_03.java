package Hw;
import javax.swing.*;
import java.awt.*;

public class Ex11_03 extends JFrame{
	public Ex11_03() {
		setTitle("이미지 버튼 예쩨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//3개의 이미지를 파일로부터 읽어들인다.
		ImageIcon normalIcon = new ImageIcon("images/normalicon.gif");
		ImageIcon rolloverIcon = new ImageIcon("imgaes/rollovericon.gif");
		ImageIcon pressedIcon = new ImageIcon("imgaes/pressedicon.gif");
		
		//3개의 이미지를 가진 버튼 생성
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);

	}
	public static void main(String[] args) {
		new Ex11_03();
	}

}
