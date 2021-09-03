//super() this()
class D{
	private int a,b,c,d,e,f;
	
	public D() {
		a=100;b=200;c=300;
		d=400;e=500;f=600;
		
				
	}
	public D(int c) {
		this();//자기자신의 클래스속의 또다른 생성자를 호출함
		this.c=c;
	}
}
class E extends D{
	private int g,h,i;
	
	public E() {
		super();//자신에게 상송을 준 상위 클래스의 생성자를 호출하여줌
		//this():super()와 같이 혼용해서 쓸수 없다. 둘다 첫줄에 와야함
	}
}

public class Ex03 {

}
