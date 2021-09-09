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
	
	private ImageIcon image = new ImageIcon("/Users/user/Desktop/practice/back.jpg");	// ��δ� �ٸ��� �����ؾ� ��
	private Image img = image.getImage();
	
	int cnt = 0;		// ��ư�� �� �� ���������� üũ�ϱ� ����
	
	public Tr12_01(){
		setTitle("�̹��� �׸��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		add(btn);							// "Hide/Show" ��ư�� �������ҿ� �߰�
		
		// btn�� ������������ �׸��� hide / show ���� (�͸� Ŭ���� ���)
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cnt++;
				if(cnt % 2 == 1) {		// �̹� �̹����� ��µǾ� �־��ٸ� �̹����� ����
					img = null;
					repaint();
				}
				else {					// �̹����� �����ٸ� �̹����� ����
					img = image.getImage();
					repaint();
				}
			}
		});
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}
	
	// paintComponent�� �̿��Ͽ� �̹��� �׸�
	class Tr12_01 extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);		// ȭ�鿡 �� ���� ����
		}
	}
	
	public static void main(String[] args) {
		new Tr12_01();
	}
}