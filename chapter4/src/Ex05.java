//this �� ���� ���� Ŭ����
public class Ex05 {
	int x;//����ʵ� Ŭ�������� �̷��� ������ ���� ���̴ٶ�� ���� ����
	int y;//-
	int a,b,c;
	
	public Ex05() {
		x=10;
		y=20;
		a=100;
		b=200;
		c=300;
	}
	public Ex05(int x) {
		this();//���ǰ����״�� ȣ���Ѵ�.
		this.x=x;//x�� ����ʵ尪�� x��°��� this�� ��������ߵȴ�.
		//y=20; ����
		//a=100;
		//b=200;
		//c=300;
	}
	public Ex05(int x, int y) {
		this(x);//�Ű����� �ϳ��ִ� ���� ���� �״�� �����Ѵ�.
		//this.x=x;
		this.y=y;
		//a=100;
		//b=200;
		//c=300;
	}
	public void disp() {
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}
