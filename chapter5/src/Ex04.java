//��ӽÿ� �̷������ �����

class DD{
	//private int x=100;//private: �ڽ��� Ŭ���������� ȣ�� ����
	//private int y=200;
	protected int x=100;//protected : �ڽ��� ��ӹ��� Ŭ�������� ��� ������ �����
	protected int y=200;
	
	public void disp() {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
class EE extends DD{
	private int z=300;
	private void display() {
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}
	
}

public class Ex04 {
	public static void main(String[] ar) {
		
	}
}
