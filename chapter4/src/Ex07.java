//������������ ����ʵ忡 ���� ����
class Sub{
	private int x=100;//private �� �� Ŭ���������� ���� ������ ���� ������.
	private char y='A';
	
	public void viewX() {
		System.out.println("x="+x);
	}
	public void viewY() {
		System.out.println("y="+y);
	}
}
public class Ex07 {
	public static void main(String[] ar) {
		Sub ex=new Sub();
		//System.out.println("ex.x="+ex.x);
		//System.out.println("ex.y="+ex.y);
		ex.viewX();
		ex.viewY();
	}

}
