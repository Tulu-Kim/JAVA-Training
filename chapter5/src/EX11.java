//추상클래스
class AX{//A라는 사람(비유)
	public void aaa() {
		System.out.println("AAA");
	}
}
class B{
	public void Aaa() {
		
	}
}
class C{
	public void aaA() {
		
	}
}

public class EX11 {
	public static void main(String[] ar) {
		A ap =new A();
		ap.aaa();
		B bp=new B();
		bp.Aaa();
		C cp=new C();
		cp.aaA();
		
	}
}
