package Project;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class ClockImg {

   JFrame frame;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
            	ClockImg window = new ClockImg();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public ClockImg() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
	   
	  frame = new JFrame();
	
	  frame.setBounds(100, 100, 617, 561);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel_beaconU = new JPanel();
      panel_beaconU.setBounds(500, 22, 100, 100);
      frame.getContentPane().add(panel_beaconU);
      panel_beaconU.setLayout(null);
      
      JButton btnBCU = new JButton("");
      btnBCU.setIcon(new ImageIcon("images\\beaconUn.jpg"));
      btnBCU.setBounds(0, 0, 100, 100);
      panel_beaconU.add(btnBCU);
      
      JPanel panel_beaconE = new JPanel();
      panel_beaconE.setBounds(500, 22, 100, 100);
      frame.getContentPane().add(panel_beaconE);
      panel_beaconE.setLayout(null);
      
      JButton btnBCE = new JButton("");
      btnBCE.setIcon(new ImageIcon("images\\beaconEn.jpg"));
      btnBCE.setBounds(0, 0, 100, 100);
      panel_beaconE.add(btnBCE);
      
      JPanel panelClock1 = new JPanel();
      panelClock1.setBounds(0, 22, 500, 500);
      frame.getContentPane().add(panelClock1);
      panelClock1.setLayout(null);
      
      JButton Clock1 = new JButton("");
      Clock1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      
      Clock1.setIcon(new ImageIcon("images\\Clockbird.jpg"));
      Clock1.setBounds(0, 0, 500, 500);
      panelClock1.add(Clock1);
      
      JPanel panelClock2 = new JPanel();
      panelClock2.setBounds(0, 22, 500, 500);
      frame.getContentPane().add(panelClock2);
      
      
      
      panelClock2.setLayout(null);
      
      JButton Clock2 = new JButton("");
      Clock2.setIcon(new ImageIcon("images\\Clock2.jpg"));
      Clock2.setBounds(0, 0, 500, 500);
      panelClock2.add(Clock2);
      
      
      
      panelClock2.setVisible(false);
      
      
      JPanel panelClock3 = new JPanel();
      panelClock3.setBounds(0, 22, 500, 500);
      frame.getContentPane().add(panelClock3);
      panelClock3.setLayout(null);
      
      JButton Clock3 = new JButton("");
      Clock3.setIcon(new ImageIcon("images\\Clock3.jpg"));
      Clock3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      Clock3.setBounds(0, 0, 500, 500);
      panelClock3.add(Clock3);
      
      JPanel panelClock4 = new JPanel();
      panelClock4.setBounds(0, 22, 500, 500);
      frame.getContentPane().add(panelClock4);
      panelClock4.setLayout(null);
      
      JButton Clock4 = new JButton("");
      Clock4.setIcon(new ImageIcon("images\\Clock4.jpg"));
      Clock4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      Clock4.setBounds(0, 0, 500, 500);
      panelClock4.add(Clock4);
      
      
      JPanel korea_panel = new JPanel();
      korea_panel.setBounds(500, 222, 50, 50);
      frame.getContentPane().add(korea_panel);
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
      frame.getContentPane().add(japan_panel);
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
      frame.getContentPane().add(china_panel);
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
      frame.getContentPane().add(usa_panel);
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
      frame.getContentPane().add(canada_panel);
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
      frame.getContentPane().add(uk_panel);
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
      frame.getContentPane().add(france_panel);
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
      frame.getContentPane().add(italy_panel);
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
      frame.getContentPane().add(mexico_panel);
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
      frame.getContentPane().add(spain_panel);
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
      frame.getContentPane().add(egypt_panel);
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
      frame.getContentPane().add(russia_panel);
      russia_panel.setLayout(null);
      
      JButton russiabtn = new JButton("");
      russiabtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      russiabtn.setIcon(new ImageIcon("images\\russia.jpg"));
      russiabtn.setBounds(0, 0, 50, 50);
      russia_panel.add(russiabtn);
      
      JMenuItem 메뉴바높이체크용 = new JMenuItem("New menu item");
      메뉴바높이체크용.setBounds(0, 0, 600, 22);
      frame.getContentPane().add(메뉴바높이체크용);
      
      //----------------------------알람비콘
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
    //----------------------------시계테마
      Clock1.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            panelClock1.setVisible(false);
            panelClock2.setVisible(true);
            
            panelClock3.setVisible(false);
            panelClock4.setVisible(false);
            
         }
      });
      Clock3.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            panelClock1.setVisible(false);
            panelClock2.setVisible(false);
            panelClock3.setVisible(false);
            panelClock4.setVisible(true);
         }
      });
      Clock4.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            panelClock1.setVisible(true);
           
            panelClock2.setVisible(false);
            panelClock3.setVisible(false);
            panelClock4.setVisible(false);
         }
      });
      
      Clock2.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            panelClock1.setVisible(false);
            panelClock2.setVisible(false);
            panelClock3.setVisible(true);
            
            panelClock4.setVisible(false);
         }
      });
   }
}
