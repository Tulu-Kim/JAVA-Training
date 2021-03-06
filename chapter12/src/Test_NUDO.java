
//그림판 만들기.
//메뉴구성 : LINE,OVAL,RECT...
//OVAL : 타원만 출력한다.
//RECT : 사각형만 출력한다.
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


class Test_NUDO_sub extends Frame implements ItemListener, MouseListener, MouseMotionListener {
	private MenuBar mb = new MenuBar();
	private Menu draw = new Menu("DRAW");
	private CheckboxMenuItem line = new CheckboxMenuItem("LINE");
	private CheckboxMenuItem oval = new CheckboxMenuItem("OVAL");
	private CheckboxMenuItem rect = new CheckboxMenuItem("RECT");
	private Menu col = new Menu("COLOR");
	private CheckboxMenuItem black = new CheckboxMenuItem("Black");
	private CheckboxMenuItem yellow = new CheckboxMenuItem("Yellow ");
	private CheckboxMenuItem green = new CheckboxMenuItem("Green");

	private int x, y, x1, y1,strt_x,strt_y,end_x,end_y;

	public Test_NUDO_sub(String title) {
		super(title);// 제목을 가지는 프레임 생성을 할 수 있음.
		super.setSize(500, 300);
		this.init();
		this.start();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = super.getSize();
		int x_pos = (int) (screen.getWidth() / 2 - frm.getWidth() / 2);
		int y_pos = (int) (screen.getHeight() / 2 - frm.getHeight() / 2);
		super.setLocation(x_pos, y_pos);

		super.setVisible(true);

	}

	public void init() {
		draw.add(line);
		draw.add(oval);
		draw.add(rect);
		mb.add(draw);
		col.add(black);
		col.add(yellow);
		col.add(green);
		mb.add(col);
		this.setMenuBar(mb);
	}

	public void start() {
		this.addWindowListener(new WindowAdapter() {// 익명 이너 클래스
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		line.addItemListener(this);
		oval.addItemListener(this);
		rect.addItemListener(this);

		this.addMouseListener(this);
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
		}
		
		
		if (line.getState() == true) {
			g.drawLine(strt_x, strt_y, end_x, end_y);
		} else if (oval.getState() == true) {

			g.drawOval(strt_x, strt_y, end_x - strt_x, end_y - strt_y);
		} else if (rect.getState() == true) {

			g.drawRect(strt_x, strt_y, end_x - strt_x, end_y - strt_y);
		}
		}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		line.setState(false);
		oval.setState(false);
		rect.setState(false);

		CheckboxMenuItem imsi = (CheckboxMenuItem) e.getSource();
		imsi.setState(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/*@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		strt_x = e.getX();
		strt_y = e.getY();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		end_x = e.getX();
		end_y = e.getY();
		this.repaint();
	}*/

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		end_x = e.getX();
		end_y = e.getY();
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class Test_NUDO {
	public static void main(String[] ar) {
		new Test_NUDO_sub("그림판");
	}
}
