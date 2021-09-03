//상속시에 이루어지는 제약어

class DD{
	//private int x=100;//private: 자신의 클래스에서만 호출 가능
	//private int y=200;
	protected int x=100;//protected : 자신을 상속받은 클래스에서 모든 접근을 허용함
	protected int y=200;
	
	public void disp() {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
class EE extends DD{
	private int z=300;
	private void display() {
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}
	
}

public class Ex04 {
	public static void main(String[] ar) {
		
	}
}
