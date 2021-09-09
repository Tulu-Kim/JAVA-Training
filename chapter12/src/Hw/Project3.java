package Hw;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Project3 extends /* JFrame */Frame implements ItemListener, MouseListener {

	// 라인을 그리기 위한 시작지점과 끝지점을 나타내는 위치정보

	private int x, y, x1, y1;

	// 기본 패널

	private MenuBar mb = new MenuBar();

	// 메뉴바 3개

	private Menu menu1 = new Menu("그리기");

	private Menu menu2 = new Menu("꽉찬 도형");

	private Menu menu3 = new Menu("지우개");

	// 메뉴바 3개의 트리

	private CheckboxMenuItem line = new CheckboxMenuItem("직선");

	private CheckboxMenuItem rect = new CheckboxMenuItem("사각형");

	private CheckboxMenuItem oval = new CheckboxMenuItem("원");

	private CheckboxMenuItem c_rect = new CheckboxMenuItem("사각형");

	private CheckboxMenuItem c_oval = new CheckboxMenuItem("원");

	private CheckboxMenuItem c_o_rect = new CheckboxMenuItem("둥근사각형");

	private CheckboxMenuItem erase = new CheckboxMenuItem("지우기");

	// private JPanel p1 = new JPanel();

	public Project3() {

		setTitle("그림판");

		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(p1);

		setSize(300, 400);

		setVisible(true);

		this.setMenuBar(mb);

		this.init();

		line.addItemListener(this);

		oval.addItemListener(this);

		rect.addItemListener(this);

		c_rect.addItemListener(this);

		c_oval.addItemListener(this);

		c_o_rect.addItemListener(this);

		erase.addItemListener(this);

		this.addMouseListener(this);

	}

	public void init() {

		// 메뉴바 3개 추가

		mb.add(menu1);

		mb.add(menu2);

		mb.add(menu3);

		// 그리기의 메뉴 3개 추가

		menu1.add(line);

		menu1.add(rect);

		menu1.add(oval);

		// 자유곡선의 메뉴 2개 추가

		menu2.add(c_rect);

		menu2.add(c_oval);

		menu2.add(c_o_rect);

		// 지우개의 메뉴 1개 추가

		menu3.add(erase);

	}

	public void update(Graphics g) {

		paint(g);

	}

	public void paint(Graphics g) {

		if (line.getState() == true) {
			g.drawLine(x, y, x1, y1);
		} else if (oval.getState() == true) {
			g.drawOval(x, y, x1 - x, y1 - y);
		} else if (rect.getState() == true) {
			g.drawRect(x, y, x1 - x, y1 - y);
		} else if (erase.getState() == true) {
			g.clearRect(x, y, x1 - x, y1 - y);
		} else if (c_rect.getState() == true) {
			g.setColor(Color.RED);
			g.fillRect(x, y, x1 - x, y1 - y);
		} else if (c_oval.getState() == true) {
			g.setColor(Color.BLUE);
			g.fillOval(x, y, x1 - x, y1 - y);
		} else if (c_o_rect.getState() == true) {
			g.setColor(Color.BLUE);
			g.fillRoundRect(x, y, x1 - x, y1 - y, (x1 - x) / 5, (x1 - x) / 5);
		}
	}

	// 체크박스 해제

	public void itemStateChanged(ItemEvent e) {

		line.setState(false);

		rect.setState(false);

		oval.setState(false);

		c_rect.setState(false);

		c_oval.setState(false);

		c_o_rect.setState(false);

		erase.setState(false);

		CheckboxMenuItem imsi = (CheckboxMenuItem) e.getSource(); // 위의 체크박스를 통해 들어온 e값을 확인해서 그것하나만을 setState 트루로 확인을함

		imsi.setState(true);

	}

	public void mousePressed(MouseEvent e) {

		x = e.getX();

		y = e.getY();

	}

	public void mouseReleased(MouseEvent e) {

		x1 = e.getX();

		y1 = e.getY();

		this.repaint();

	}

	public static void main(String[] args) {

		new Project3();

	}

	@Override

	public void mouseClicked(MouseEvent e) {

		// TODO Auto-generated method stub

	}

	@Override

	public void mouseEntered(MouseEvent e) {

		// TODO Auto-generated method stub

	}

	@Override

	public void mouseExited(MouseEvent e) {

		// TODO Auto-generated method stub

	}

}
