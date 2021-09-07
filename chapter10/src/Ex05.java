//������ ���½�Ű�� ���̺긦 �����ϴ�

import java.awt.*;
import java.awt.event.*;

class Ex05_sub extends Frame implements 
ActionListener/*,WindowListener*/{
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("File");
	private MenuItem fopen = new MenuItem("OPEN");
	private MenuItem fsave = new MenuItem("SAVE");
	
	private FileDialog fdlg1 = new FileDialog(this,"��������",FileDialog.LOAD);
	private FileDialog fdlg2 = new FileDialog(this,"��������",FileDialog.SAVE);

	
	public Ex05_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		super.setSize(500,300);
		this.init();//ȭ���ʱ�ȭ
		this.start();//�߰��Ǵ� �̺�Ʈ�� ����
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
		
	}
	public void init() {
		file.add(fopen);
		file.add(fsave);
		mb.add(file);
		this.setMenuBar(mb);
	
	}
	public void start() {
		WindowAdapter wa= new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(wa);
		fopen.addActionListener(this);
		fsave.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==fopen) {
			fdlg1.setVisible(true);
		}
		else if(e.getSource()==fsave){
			fdlg2.setVisible(true);
		}
	
}

	//�����츮������ ������ ���� �޼ҽ���
	/*@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}*/
}
public class Ex05 {
	public static void main(String[] ar) {
		new Ex05_sub("����");
	}
}

