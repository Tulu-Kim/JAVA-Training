//interface?
interface DDD{//���߻���� ���� ������ �⤱���ʵ带 �����Ե�
	//static final�� ���ǰ� �Ǿ����.
	public static int w=0;
	public static final int x=100;
	public final int y=200;
	public int z = 300;
	
	//void ddd() {} �������Ǻο����� �ż����� ����� �ʵ�(��ü������ �ȵ�)
	public static class Inner{}//������ �̳�Ŭ������ ����., (������ ����� ������)
	//��ӽ�ų �޼��带 ���Ǹ� ��.
	public abstract void aaa();
	public void bbb();
	void ccc();
}

public class Ex13 {
	public static void name(String[] ar) {
		System.out.println("w="+DDD.w);
		System.out.println("x="+DDD.x);
		System.out.println("y="+DDD.y);
		System.out.println("z="+DDD.x);
		
	}
}
