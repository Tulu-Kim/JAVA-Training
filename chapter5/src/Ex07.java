//오버라이딩의 예
class GG{
	public void aaa() {
		System.out.println("GG");
	}
}
class JJ extends GG{
	public void aaa() {
		super.aaa();//자기를 상속한 상위의 내용을 호출할수 있음,오버라이딩
		System.out.println("JJ");
	}
}
public class Ex07 {
	public static void main(String[] ra){
		GG gp = new GG();
		JJ jp = new JJ();
		jp.aaa();
	}

}
