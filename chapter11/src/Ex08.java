
import java.awt.*;

class Ex08_sub extends Frame{
	private MenuBar mb = new MenuBar();
	private Menu file=new Menu("File");
	private MenuItem fnew = new MenuItem("NEW");
	private MenuItem fopne = new MenuItem("opne");
	private MenuItem fsave = new MenuItem("save");
	private MenuItem fdod = new MenuItem("dod");
	
	private Menu edit = new Menu("EDIT");
	private Menu ecolor = new Menu("COLOR");
	private CheckboxMenuItem red_cb = new CheckboxMenuItem("RED");
	private CheckboxMenuItem green_cb = new CheckboxMenuItem("GREEN");
	private CheckboxMenuItem blue_cb = new CheckboxMenuItem("BLUE");
	
	private Menu esize = new Menu("SIZE");
	
	private Menu help = new Menu("help");
	private MenuItem hver = new MenuItem("VERTION");
	
	
	public Ex08_sub(String title) {
		super(title);//제목을 가지는 프레임 생성을 할 수 있음.
		super.setSize(500,300);
		this.init();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		int x_pos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int y_pos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(x_pos,y_pos);
		
		super.setVisible(true);
		
	}
	public void init() {
		file.add(fnew); file.addSeparator();//분할선 넣기
		file.add(fopne);
		file.add(fdod); file.addSeparator();
		file.add(fsave);
        mb.add(file);
		
        ecolor.add(red_cb);
        ecolor.add(green_cb);
        ecolor.add(blue_cb);
        edit.add(ecolor);//메뉴속 메뉴
        edit.addSeparator();//분할선
        edit.add(esize);//메뉴속 메뉴
		mb.add(edit);
		mb.add(help);
		help.add(hver);
		
		this.setMenuBar(mb);	
	}
}
public class Ex08 {
	public static void main(String[] ar) {
		new Ex08_sub("제목");
	}
}