//�ż����� �����ε��� ������
class FF{
	private int x;
	private int y;
	public void setXY(int x) {//�޼ҵ�1<--
		this.x=x;
		this.y=100;
	}
	public void setXY(int x,int y) {//�޼ҵ�2
		this.x=x;
		this.y=y;
	}
	 
}
class HH extends FF{
	 public void setXY(int x) {
		 //�������Ǻ�(�޼ҵ� �������̵�-->)
	 }
}
public class Ex06 {
	public static void main(String[] ar) {
		FF fp=new FF();
		fp.setXY(100);//�޼ҵ�1�� ����
		fp.setXY(100,200);//�޼ҵ�2�� ����-> �޼ҵ� �����θ�
	}
	

}
