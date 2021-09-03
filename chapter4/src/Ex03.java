//접근자와 오버로딩에 대한 예제
public class Ex03 {
	private int x;
	private int y;
	public Ex03() {
		x=10;
		y=10;
	}
	public Ex03(int a) {
		x=a;
		y=20;
	}
	public Ex03(int a,int b) {
		x=a;
		y=b;
	}
	void disp() {
		System.out.println("출력");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println();
		
	}
	
}
