//������
//�θ�ü�� ���ؼ� �ڽİ�ü�� ȿ���ϴ� ���
class TT{//�θ� ��ü
	protected int x=100;
}
class RR extends TT{
	int y =300;
}
class WW extends TT{
	int z=400;
}
public class Ex10 {
	public static void main(String[] ar) {
		RR rp=new RR();
		System.out.println("rp.x="+rp.x);
		System.out.println("rp.y="+rp.y);
		WW wp=new WW();
		System.out.println("wp.x="+wp.x);
		System.out.println("wp.z="+wp.z);
		
		
	}

}
