package Hw;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Project3 extends /* JFrame */Frame implements ItemListener, MouseListener {

	// ������ �׸��� ���� ���������� �������� ��Ÿ���� ��ġ����

	private int x, y, x1, y1;

	// �⺻ �г�

	private MenuBar mb = new MenuBar();

	// �޴��� 3��

	private Menu menu1 = new Menu("�׸���");

	private Menu menu2 = new Menu("���� ����");

	private Menu menu3 = new Menu("���찳");

	// �޴��� 3���� Ʈ��

	private CheckboxMenuItem line = new CheckboxMenuItem("����");

	private CheckboxMenuItem rect = new CheckboxMenuItem("�簢��");

	private CheckboxMenuItem oval = new CheckboxMenuItem("��");

	private CheckboxMenuItem c_rect = new CheckboxMenuItem("�簢��");

	private CheckboxMenuItem c_oval = new CheckboxMenuItem("��");

	private CheckboxMenuItem c_o_rect = new CheckboxMenuItem("�ձٻ簢��");

	private CheckboxMenuItem erase = new CheckboxMenuItem("�����");

	// private JPanel p1 = new JPanel();

	public Project3() {

		setTitle("�׸���");

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

		// �޴��� 3�� �߰�

		mb.add(menu1);

		mb.add(menu2);

		mb.add(menu3);

		// �׸����� �޴� 3�� �߰�

		menu1.add(line);

		menu1.add(rect);

		menu1.add(oval);

		// ������� �޴� 2�� �߰�

		menu2.add(c_rect);

		menu2.add(c_oval);

		menu2.add(c_o_rect);

		// ���찳�� �޴� 1�� �߰�

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

	// üũ�ڽ� ����

	public void itemStateChanged(ItemEvent e) {

		line.setState(false);

		rect.setState(false);

		oval.setState(false);

		c_rect.setState(false);

		c_oval.setState(false);

		c_o_rect.setState(false);

		erase.setState(false);

		CheckboxMenuItem imsi = (CheckboxMenuItem) e.getSource(); // ���� üũ�ڽ��� ���� ���� e���� Ȯ���ؼ� �װ��ϳ����� setState Ʈ��� Ȯ������

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
