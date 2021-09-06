//JFrame()을 이용한 Gridlayout()
import javax.swing.*;
import java.awt.*;
public class Ex10 extends JFrame{
	public Ex10() {
		setTitle("GridLayout예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=getContentPane();
		cp.setLayout(new GridLayout(2,5));
		for(int i =1;i<10;i++) {
		String txt = Integer.toString(i);
			JButton bt = new JButton(txt);
			cp.add(bt);
		}
		setSize(300,400);
		setVisible(true);
		}
	public static void main(String[] ar) {
		new Ex10();
	}
}
