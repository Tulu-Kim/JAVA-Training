//�������̵� ���� final: �� ��ü�� ���� ���������� ��������. 
//���̻� �����̸��� ��� �Ұ�

/*final*/class OO{
	public /*final*/ void aaa() {
		System.out.println("OO");		
	}
}
class PP extends OO{
	public void aaa() {
		System.out.println("PP");
	}
}
public class Ex08 {
	public static void main(String[] ar) {
		PP pp = new PP();
		pp.aaa();
		
	}
}
