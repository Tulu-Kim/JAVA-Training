//접근제한자의 멤버필드에 대한 예제
class Sub{
	private int x=100;//private 는 이 클래스에서만 접근 가능한 접근 지정자.
	private char y='A';
	
	public void viewX() {
		System.out.println("x="+x);
	}
	public void viewY() {
		System.out.println("y="+y);
	}
}
public class Ex07 {
	public static void main(String[] ar) {
		Sub ex=new Sub();
		//System.out.println("ex.x="+ex.x);
		//System.out.println("ex.y="+ex.y);
		ex.viewX();
		ex.viewY();
	}

}
