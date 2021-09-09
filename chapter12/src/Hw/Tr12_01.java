import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Tr12_01 extends JFrame{
	private MyPanel panel = new MyPanel();
	private JButton btn = new JButton("Hide/Show");
	
	private ImageIcon image = new ImageIcon("/Users/user/Desktop/practice/back.jpg");	// 경로는 다르게 설정해야 함
	private Image img = image.getImage();
	
	int cnt = 0;		// 버튼이 몇 번 눌러졌는지 체크하기 위함
	
	public Tr12_01(){
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		add(btn);							// "Hide/Show" 버튼을 컨텐츠팬에 추가
		
		// btn이 눌러질때마다 그림의 hide / show 설정 (익명 클래스 사용)
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cnt++;
				if(cnt % 2 == 1) {		// 이미 이미지가 출력되어 있었다면 이미지를 없앰
					img = null;
					repaint();
				}
				else {					// 이미지가 없었다면 이미지를 설정
					img = image.getImage();
					repaint();
				}
			}
		});
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}
	
	// paintComponent를 이용하여 이미지 그림
	class Tr12_01 extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);		// 화면에 꽉 차게 설정
		}
	}
	
	public static void main(String[] args) {
		new Tr12_01();
	}
}