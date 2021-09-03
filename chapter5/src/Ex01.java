//상속
class A /*extends Object*/{
	public void aaa() {
		System.out.println("aaa클래스");
	}
	
}

public class Ex01 {//extends Object 생략
	public static void main(String[] ar) {
		A ap=new A();
		ap.aaa();
		System.out.println("크래스는 ="+ap.getClass());
		System.out.println("to_string()="+ap.toString());
		System.out.println("ap="+ap);
	}
}
