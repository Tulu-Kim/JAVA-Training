//�������̵��� ��
class GG{
	public void aaa() {
		System.out.println("GG");
	}
}
class JJ extends GG{
	public void aaa() {
		super.aaa();//�ڱ⸦ ����� ������ ������ ȣ���Ҽ� ����,�������̵�
		System.out.println("JJ");
	}
}
public class Ex07 {
	public static void main(String[] ra){
		GG gp = new GG();
		JJ jp = new JJ();
		jp.aaa();
	}

}
