//final�޼ҵ��� ����,����
class Ex09_sub{
	private final double pi=3.14;
	
	public void setPi(double pi) {
		//this.pi=pi;
		}
	public double getpi() {
		return pi;
	}
}
public class Ex09 {
	public static void main(String[] ar) {//���� �޼���
		Ex09_sub ex=new Ex09_sub();
		ex.setPi(41.14159); //Ex09_sub���� final �ʵ�� 3.14�� �ʱ�ȭ �Ǿ�����
		System.out.println("pi="+ex.getpi());
		
		
	}

}
