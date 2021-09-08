//FileDialogd의 대한 이야기
import java.awt.*;

class Ex07_sub extends Frame{
	private FileDialog fdlg = new FileDialog(this,"저장",FileDialog.SAVE);
															//LOAD
	
	public Ex07_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
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
		new Ex07_sub("제목");
	}
}