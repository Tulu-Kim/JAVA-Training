package Project;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

import java.text.*;

class AnalogueClock extends Frame implements ItemListener, Runnable {
	/*Image memoryimage; //���� ���۸� ����� ���� �޸𸮻� ȭ�� �����ŭ�� �̹��� ���۸� ����
	Graphics mgc;//������ �̹��� ���ۿ� ���� �׷��Ƚ� ��ü�� �����´�.
*/	
	//private BorderLayout b1 = new BorderLayout(); //�������̾ƿ� �ʱ�ȭ
	
	/*private Button bt1 = new Button("bt1");
	private Button bt2 = new Button("bt2");
	private Button bt3 = new Button("bt3");
	private Button bt4 = new Button("bt4");
	private Button bt5 = new Button("bt5");*///����� ��ư �κ�

	JRadioButton rd1 = new JRadioButton("C");
    JRadioButton rd2 = new JRadioButton("Ruby");
    JRadioButton rd3 = new JRadioButton("Python");//����� üũ�ڽ� �κ�

	
	int x, y, width, heigh, sx, sy, mx, my, hx, hy, centerX, centerY;
	private String timeZoneStr = "Asia/Seoul";// Ÿ���� �ʱ�ȭ, �ð��� �����
//�޴� ����//
	private MenuBar mb = new MenuBar();

	private Menu tema = new Menu("�׸�");

	private CheckboxMenuItem tema1 = new CheckboxMenuItem("�׸�1", true);
	private CheckboxMenuItem tema2 = new CheckboxMenuItem("�׸�2");
	private CheckboxMenuItem tema3 = new CheckboxMenuItem("�׸�3");
	private CheckboxMenuItem tema4 = new CheckboxMenuItem("�׸�4");

	private Menu alarm = new Menu("�˶�");
	static CheckboxMenuItem beacon = new CheckboxMenuItem("����");

	private Menu word_time = new Menu("����ð�");
	private CheckboxMenuItem Korea = new CheckboxMenuItem("�ѱ�", true);
	private CheckboxMenuItem America = new CheckboxMenuItem("�̱�");
	private CheckboxMenuItem Japan = new CheckboxMenuItem("�Ϻ�");
	private CheckboxMenuItem China = new CheckboxMenuItem("�߱�");
	private CheckboxMenuItem England = new CheckboxMenuItem("����");

	private String imgFile = "images/Clock5.jpg";// �̹��� �ּ� �ʱ�ȣ
	private ImageIcon icon = new ImageIcon(imgFile);
	private Image img = icon.getImage();

	Calendar cal = Calendar.getInstance();

	AnalogueClock() {
		setTitle("AnalogueClock");
		setSize(400, 400);

		setVisible(true);
		setResizable(false);// ������ ũ�� ���� ���ϰ�
		this.init();
		this.start();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void init() {
		//this.setLayout(b1);//���̾ƿ�
		
		
		tema.add(tema1);
		tema.add(tema2);
		tema.add(tema3);
		tema.add(tema4);
		mb.add(tema);

		alarm.add(beacon);
		mb.add(alarm);

		word_time.add(Korea);
		word_time.add(America);
		word_time.add(Japan);
		word_time.add(China);
		word_time.add(England);
		mb.add(word_time);

		this.setMenuBar(mb);
	}

	public void start() {

		tema1.addItemListener(this);
		tema2.addItemListener(this);
		tema3.addItemListener(this);
		tema4.addItemListener(this);

		beacon.addItemListener(this);

		Korea.addItemListener(this);
		America.addItemListener(this);
		Japan.addItemListener(this);
		China.addItemListener(this);
		England.addItemListener(this);

	}

	public void paint(Graphics g) {
		/*Image memoryimage = createImage(400, 400);//���� ���۸� ����� ���� �޸𸮻� ȭ�� �����ŭ�� �̹��� ���۸� ����
		Graphics mgc = memoryimage.getGraphics();//������ �̹��� ���ۿ� ���� �׷��Ƚ� ��ü�� �����´�.
		
		mgc.drawImage(img,50,50,this);
		mgc.clearRect(0 ,0,400,400);
		mgc.drawImage(img,50,50,this);
		
		g.drawImage(memoryimage, 0, 0, this);*/
		
		
		g.drawImage(img, 50, 50, null);// ��� �̹����� �׸���.

		TimeZone tz;
		tz = TimeZone.getTimeZone(timeZoneStr);
		Date date = new Date();

		DateFormat se = new SimpleDateFormat("ss");
		DateFormat mi = new SimpleDateFormat("mm");
		DateFormat ho = new SimpleDateFormat("HH");
	

		se.setTimeZone(tz);
		mi.setTimeZone(tz);
		ho.setTimeZone(tz);
	    
	
		int second = Integer.parseInt(se.format(date));
		int minute = Integer.parseInt(mi.format(date));
		int hour = Integer.parseInt(ho.format(date));// Ÿ������ �����Ͽ� �ú��� ����κ�

		x = 100;
		y = 100;
		width = 200;
		heigh = 200;
//g.drawOval(x, y, width, heigh);// ��

		int r = 100; // ������
		centerX = 200; // �߽���
		centerY = 200;
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(8));
		sx = centerX + (int) ((r - 10) * Math.cos(Math.PI / 2 - second * (Math.PI / 30)));
		sy = centerY - (int) ((r - 10) * Math.sin(Math.PI / 2 - second * (Math.PI / 30)));
		g.setColor(Color.red);
		g.drawLine(centerX, centerY, sx, sy);// ��ħ�� �׸���
		mx = centerX + (int) ((r - 20) * Math.cos(Math.PI / 2 - minute * (Math.PI / 30)));
		my = centerY - (int) ((r - 20) * Math.sin(Math.PI / 2 - minute * (Math.PI / 30)));
		g.setColor(Color.green);
		g.drawLine(centerX, centerY, mx, my);// ��ħ�� �׸���
		hx = centerX + (int) ((r - 40) * Math.cos(Math.PI / 2 - ((hour * 60 + minute) / 10) * (Math.PI / 36)));
		hy = centerY - (int) ((r - 40) * Math.sin(Math.PI / 2 - ((hour * 60 + minute) / 10) * (Math.PI / 36)));
		g.setColor(Color.blue);
		g.drawLine(centerX, centerY, hx, hy);// ��ħ�� �׸���.

	}
	public void update(Graphics g) 
	{
		paint(g);
	}
	
	public void run() // 1�ʿ� �ѹ��� paint�޼ҵ� ȣ��
	{
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			repaint();
		}
	}

	public void itemStateChanged(ItemEvent e) {
// TODO Auto-generated method stub

		tema1.setState(false);
		tema2.setState(false);
		tema3.setState(false);
		tema4.setState(false);

// if(beacon.getState()) {
		beacon.setState(false);

		Korea.setState(false);
		America.setState(false);
		Japan.setState(false);
		China.setState(false);
		England.setState(false);

		CheckboxMenuItem imsi = (CheckboxMenuItem) e.getSource();
		imsi.setState(true);

		if (Korea.getState()) {
			timeZoneStr = "Asia/Seoul";
		} else if (America.getState()) {
			timeZoneStr = "America";
		} else if (Japan.getState()) {
			timeZoneStr = "Asia/Tokyo";
		} else if (China.getState()) {
			timeZoneStr = "Asia/Shanghai";
		} else if (England.getState()) {
			timeZoneStr = "Europ//London";
		} // ������ �ð� ����

		if (tema1.getState()) {
			imgFile = new String("images/Clock1.jpg");
		} else if (tema2.getState()) {
			imgFile = new String("images/Clock2.jpg");
		} else if (tema3.getState()) {
			imgFile = new String("images/Clock3.jpg");
		} else if (tema4.getState()) {
			imgFile = new String("images/Clock4.jpg");
		} // ����̹��� ����
		icon = new ImageIcon(imgFile);
		img = icon.getImage();// �޴� üũ�� �ϸ� ��� �̹��� �ּ� �ٲٴ� �κ�
	}

	public static void main(String[] args) {
		AnalogueClock clock = new AnalogueClock();
		Thread t = new Thread(clock);
		t.start();// ������ ó��

		// ������ ����Ŭ�����κ��� �����ϴ� ���
		Thread t1 = new Thread() {
			public void run() {
				while (true) {
					try {
						Calendar cal = Calendar.getInstance();
						int beaconH = cal.get(Calendar.HOUR_OF_DAY);
						int beaconM = cal.get(Calendar.MINUTE);
						int beaconS = cal.get(Calendar.SECOND);

						if (beacon.getState()) {
							if (((beaconH == 8) || (beaconH == 17)) && (beaconM == 50) && (beaconS == 0)) {
								JOptionPane.showMessageDialog(null, "���� ��� �ð��Դϴ�.");
							}
						}
						
						Thread.sleep(1000);

					} catch (InterruptedException e) {
					}

				}
			}

		};
		t1.start();
	}
}