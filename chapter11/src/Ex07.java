//FileDialogd�� ���� �̾߱�
import java.awt.*;

class Ex07_sub extends Frame{
	private FileDialog fdlg = new FileDialog(this,"����",FileDialog.SAVE);
															//LOAD
	
	public Ex07_sub(String title) {
		super(title);//������ ������ ������ ������ �� �� ����.
		super.setSize(500,300);
		this.init();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
		
		fdlg.setVisible(true);
		fdlg.setLocation(300,200);
		
	}
	public void init() {
		
	}
	
}
public class Ex07 {
	public static void main(String[] ar) {
		new Ex07_sub("����");
	}
}