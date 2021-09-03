//this 의 대한 예제 클래스
public class Ex05 {
	int x;//멤버필드 클래스에서 이렇게 변수가 사용될 것이다라는 변수 선헌
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
		this();//위의것을그대로 호출한다.
		this.x=x;//x는 멤버필드값의 x라는것을 this로 정의해줘야된다.
		//y=20; 생약
		//a=100;
		//b=200;
		//c=300;
	}
	public Ex05(int x, int y) {
		this(x);//매개변수 하나있는 위의 것을 그대로 수행한다.
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
