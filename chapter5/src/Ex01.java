//���
class A /*extends Object*/{
	public void aaa() {
		System.out.println("aaaŬ����");
	}
	
}

public class Ex01 {//extends Object ����
	public static void main(String[] ar) {
		A ap=new A();
		ap.aaa();
		System.out.println("ũ������ ="+ap.getClass());
		System.out.println("to_string()="+ap.toString());
		System.out.println("ap="+ap);
	}
}
