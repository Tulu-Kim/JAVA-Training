class F{
	protected int x=100;
	protected int y=200;
	protected int z=700;
	
}
class H extends F{
	private int x=300;
	private int y=400;
	private int z=500;

	public void disp() {
		System.out.println("x="+this.x);//�̶�x�� � x������ �˷��� �ʿ䰡 ����.
		System.out.println("y="+super.y);//���� Ŭ������ y���� �ǹ���
		System.out.println("z="+super.z);//this.z(�ڱ� Ŭ������ z),super.z(������� Ŭ������ z) 
		
	}
}
public class Ex05{
	public static void main(String[] ar) {
		F fp=new F();
		H hp=new H();
		hp.disp();
		
	}
	
}



