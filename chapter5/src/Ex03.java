//super() this()
class D{
	private int a,b,c,d,e,f;
	
	public D() {
		a=100;b=200;c=300;
		d=400;e=500;f=600;
		
				
	}
	public D(int c) {
		this();//�ڱ��ڽ��� Ŭ�������� �Ǵٸ� �����ڸ� ȣ����
		this.c=c;
	}
}
class E extends D{
	private int g,h,i;
	
	public E() {
		super();//�ڽſ��� ����� �� ���� Ŭ������ �����ڸ� ȣ���Ͽ���
		//this():super()�� ���� ȥ���ؼ� ���� ����. �Ѵ� ù�ٿ� �;���
	}
}

public class Ex03 {

}
