package Project;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

import java.text.*;

class AnalogueClock3 extends JFrame implements ItemListener, Runnable {
	/*Image memoryimage; //더블 버퍼링 기법을 위한 메모리상에 화면 사이즈만큼의 이미지 버퍼를 생성
	Graphics mgc;//생성한 이미지 버퍼에 대한 그래픽스 객체를 가져온다.
*/	
	
	JPanel pnlButton = new JPanel();
	 JButton btnAddFlight = new JButton("Add Flight");
	//private BorderLayout b1 = new BorderLayout(); //보더레이아웃 초기화
	
	/*private Button bt1 = new Button("bt1");
	private Button bt2 = new Button("bt2");
	private Button bt3 = new Button("bt3");
	private Button bt4 = new Button("bt4");
	private Button bt5 = new Button("bt5");*///실험용 버튼 부분

	
	int x, y, width, heigh, sx, sy, mx, my, hx, hy, centerX, centerY;
	private String timeZoneStr = "Asia/Seoul";// 타임존 초기화, 시간은 서울로
//메뉴 셋팅//
	private MenuBar mb = new MenuBar();

	private Menu tema = new Menu("테마");

	private CheckboxMenuItem tema1 = new CheckboxMenuItem("테마1", true);
	private CheckboxMenuItem tema2 = new CheckboxMenuItem("테마2");
	private CheckboxMenuItem tema3 = new CheckboxMenuItem("테마3");
	private CheckboxMenuItem tema4 = new CheckboxMenuItem("테마4");

	private Menu alarm = new Menu("알람");
	static CheckboxMenuItem beacon = new CheckboxMenuItem("비콘");

	private Menu word_time = new Menu("세계시간");
	private CheckboxMenuItem Korea = new CheckboxMenuItem("한국", true);
	private CheckboxMenuItem America = new CheckboxMenuItem("미국");
	private CheckboxMenuItem Japan = new CheckboxMenuItem("일본");
	private CheckboxMenuItem China = new CheckboxMenuItem("중국");
	private CheckboxMenuItem England = new CheckboxMenuItem("영국");

	private String imgFile = "images/Clockbird.jpg";// 이미지 주소 초기호
	private ImageIcon icon = new ImageIcon(imgFile);
	private Image img = icon.getImage();

	Calendar cal = Calendar.getInstance();

	AnalogueClock3() {
		setTitle("AnalogueClock");
		setSize(617, 561);
		//setBackground(Color.BLACK);
		setVisible(true);
		setResizable(false);// 프레임 크기 변경 못하게
		this.setLayout(null);
		this.init();
		this.start();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void init() {
		//this.setLayout(b1);//레이아웃
	
	        
	    	
	        JPanel panel_beaconU = new JPanel();
	        panel_beaconU.setBounds(502, 22, 100, 100);
	        add(panel_beaconU);
	        panel_beaconU.setLayout(null);
	        
	        JButton btnBCU = new JButton("");
	        btnBCU.setIcon(new ImageIcon("images\\beaconUn.jpg"));
	        btnBCU.setBounds(0, 0, 100, 100);
	        panel_beaconU.add(btnBCU);
	        
	        JPanel panel_beaconE = new JPanel();
	        panel_beaconE.setBounds(502, 22, 100, 100);
	        add(panel_beaconE);
	        panel_beaconE.setLayout(null);
	        
	        JButton btnBCE = new JButton("");
	        btnBCE.setIcon(new ImageIcon("images\\beaconEn.jpg"));
	        btnBCE.setBounds(0, 0, 100, 100);
	        panel_beaconE.add(btnBCE);   
	        
	        JPanel korea_panel = new JPanel();
	        korea_panel.setBounds(500, 222, 50, 50);
	        add(korea_panel);
	        korea_panel.setLayout(null);
	        
	        JButton koreabtn = new JButton("");
	        koreabtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        koreabtn.setBounds(0, 0, 50, 50);
	        korea_panel.add(koreabtn);
	        koreabtn.setIcon(new ImageIcon("images\\korea.jpg"));
	        
	        JPanel japan_panel = new JPanel();
	        japan_panel.setBounds(550, 222, 50, 50);
	        add(japan_panel);
	        japan_panel.setLayout(null);
	        
	        JButton japanbtn = new JButton("");
	        japanbtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        japanbtn.setIcon(new ImageIcon("images\\japan.jpg"));
	        japanbtn.setBounds(0, 0, 50, 50);
	        japan_panel.add(japanbtn);
	        
	        JPanel china_panel = new JPanel();
	        china_panel.setBounds(500, 272, 50, 50);
	        add(china_panel);
	        china_panel.setLayout(null);
	        
	        JButton chinabtn = new JButton("");
	        chinabtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        chinabtn.setIcon(new ImageIcon("images\\china.jpg"));
	        chinabtn.setBounds(0, 0, 50, 50);
	        china_panel.add(chinabtn);
	        
	        JPanel usa_panel = new JPanel();
	        usa_panel.setBounds(550, 272, 50, 50);
	        add(usa_panel);
	        usa_panel.setLayout(null);
	        
	        JButton usabtn = new JButton("");
	        usabtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        usabtn.setIcon(new ImageIcon("images\\usa.jpg"));
	        usabtn.setBounds(0, 0, 50, 50);
	        usa_panel.add(usabtn);
	        
	        JPanel canada_panel = new JPanel();
	        canada_panel.setBounds(500, 322, 50, 50);
	        add(canada_panel);
	        canada_panel.setLayout(null);
	        
	        JButton canadabtn = new JButton("");
	        canadabtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        canadabtn.setIcon(new ImageIcon("images\\canada.jpg"));
	        canadabtn.setBounds(0, 0, 50, 50);
	        canada_panel.add(canadabtn);
	        
	        JPanel uk_panel = new JPanel();
	        uk_panel.setBounds(550, 322, 50, 50);
	        add(uk_panel);
	        uk_panel.setLayout(null);
	        
	        JButton ukbtn = new JButton("");
	        ukbtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        ukbtn.setBounds(0, 0, 50, 50);
	        uk_panel.add(ukbtn);
	        ukbtn.setIcon(new ImageIcon("images\\uk.jpg"));
	        
	        JPanel france_panel = new JPanel();
	        france_panel.setBounds(500, 372, 50, 50);
	        add(france_panel);
	        france_panel.setLayout(null);
	        
	        JButton francebtn = new JButton("");
	        francebtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        francebtn.setIcon(new ImageIcon("images\\france.jpg"));
	        francebtn.setBounds(0, 0, 50, 50);
	        france_panel.add(francebtn);
	        
	        JPanel italy_panel = new JPanel();
	        italy_panel.setBounds(550, 372, 50, 50);
	        add(italy_panel);
	        italy_panel.setLayout(null);
	        
	        JButton italybtn = new JButton("");
	        italybtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        italybtn.setIcon(new ImageIcon("images\\italy.jpg"));
	        italybtn.setBounds(0, 0, 50, 50);
	        italy_panel.add(italybtn);
	        
	        JPanel mexico_panel = new JPanel();
	        mexico_panel.setBounds(500, 422, 50, 50);
	        add(mexico_panel);
	        mexico_panel.setLayout(null);
	        
	        JButton mexicobtn = new JButton("");
	        mexicobtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        mexicobtn.setIcon(new ImageIcon("images\\mexico.jpg"));
	        mexicobtn.setBounds(0, 0, 50, 50);
	        mexico_panel.add(mexicobtn);
	        
	        JPanel spain_panel = new JPanel();
	        spain_panel.setBounds(550, 422, 50, 50);
	        add(spain_panel);
	        spain_panel.setLayout(null);
	        
	        JButton spainbtn = new JButton("");
	        spainbtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        spainbtn.setIcon(new ImageIcon("images\\spain.jpg"));
	        spainbtn.setBounds(0, 0, 50, 50);
	        spain_panel.add(spainbtn);
	        
	        JPanel egypt_panel = new JPanel();
	        egypt_panel.setBounds(500, 472, 50, 50);
	        add(egypt_panel);
	        egypt_panel.setLayout(null);
	        
	        JButton egyptbtn = new JButton("");
	        egyptbtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        egyptbtn.setBounds(0, 0, 50, 50);
	        egypt_panel.add(egyptbtn);
	        egyptbtn.setIcon(new ImageIcon("images\\egypt.jpg"));
	        
	        JPanel russia_panel = new JPanel();
	        russia_panel.setBounds(550, 472, 50, 50);
	        add(russia_panel);
	        russia_panel.setLayout(null);
	        
	        JButton russiabtn = new JButton("");
	        russiabtn.addActionListener(new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	           }
	        });
	        russiabtn.setIcon(new ImageIcon("images\\russia.jpg"));
	        russiabtn.setBounds(0, 0, 50, 50);
	        russia_panel.add(russiabtn);
	        
	        btnBCU.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               panel_beaconU.setVisible(false);
	               panel_beaconE.setVisible(true);
	               
	            }
	         });
	         btnBCE.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               panel_beaconU.setVisible(true);
	               
	               panel_beaconE.setVisible(false);
	               
	            }
	         });
	         koreabtn.addActionListener(new ActionListener() {
		            
		            @Override
		            public void actionPerformed(ActionEvent e) {
		        		timeZoneStr = "Asia/Seoul";
		    		
		    			
		               
		            }
		         });
	         usabtn.addActionListener(new ActionListener() {
		            
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	timeZoneStr = "America";
		               
		            }
		         });
	        
	        
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
	/*	Image memoryimage = createImage(500, 500);//더블 버퍼링 기법을 위한 메모리상에 화면 사이즈만큼의 이미지 버퍼를 생성
		Graphics mgc = memoryimage.getGraphics();//생성한 이미지 버퍼에 대한 그래픽스 객체를 가져온다.
		
		mgc.drawImage(img,9,51,this);
		mgc.clearRect(9 ,51,500,500);
		mgc.drawImage(img,9,51,this);
		
		g.drawImage(memoryimage, 0, 0, this);*/
		
		
		g.drawImage(img, 9, 51, null);// 배경 이미지를 그린다.

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
		int hour = Integer.parseInt(ho.format(date));// 타임존을 변경하여 시분초 변경부분

		x = 100;
		y = 100;
		width = 200;
		heigh = 200;
//g.drawOval(x, y, width, heigh);// 원

		int r = 100; // 반지름
		centerX = 250; // 중심점
		centerY = 250;

		sx = centerX + (int) ((r - 10) * Math.cos(Math.PI / 2 - second * (Math.PI / 30)));
		sy = centerY - (int) ((r - 10) * Math.sin(Math.PI / 2 - second * (Math.PI / 30)));
		g.setColor(Color.red);
		g.drawLine(centerX, centerY, sx, sy);// 초침을 그린다
		mx = centerX + (int) ((r - 20) * Math.cos(Math.PI / 2 - minute * (Math.PI / 30)));
		my = centerY - (int) ((r - 20) * Math.sin(Math.PI / 2 - minute * (Math.PI / 30)));
		g.setColor(Color.green);
		g.drawLine(centerX, centerY, mx, my);// 분침을 그린다
		hx = centerX + (int) ((r - 40) * Math.cos(Math.PI / 2 - ((hour * 60 + minute) / 10) * (Math.PI / 36)));
		hy = centerY - (int) ((r - 40) * Math.sin(Math.PI / 2 - ((hour * 60 + minute) / 10) * (Math.PI / 36)));
		g.setColor(Color.blue);
		g.drawLine(centerX, centerY, hx, hy);// 시침을 그린다.

	}
	public void update(Graphics g) 
	{
		paint(g);
	}
	
	public void run() // 1초에 한번씩 paint메소드 호출
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
		} // 국가별 시간 변경

		if (tema1.getState()) {
			imgFile = new String("images/Clock1.jpg");
		} else if (tema2.getState()) {
			imgFile = new String("images/Clock2.jpg");
		} else if (tema3.getState()) {
			imgFile = new String("images/Clock3.jpg");
		} else if (tema4.getState()) {
			imgFile = new String("images/Clock4.jpg");
		} // 배경이미지 변경
		icon = new ImageIcon(imgFile);
		img = icon.getImage();// 메뉴 체크를 하면 배경 이미지 주소 바꾸는 부분
	}

	public static void main(String[] args) {
		AnalogueClock3 clock = new AnalogueClock3();
		Thread t = new Thread(clock);
		t.start();// 스레드 처리

		// 스레드 하위클래스로부터 생성하는 방법
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
								JOptionPane.showMessageDialog(null, "비콘 출결 시간입니다.");
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