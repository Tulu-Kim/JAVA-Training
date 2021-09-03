//오버라이딩 방지 final: 그 객체를 최종 마지막으로 만들어버림. 
//더이상 같은이름은 사용 불가

/*final*/class OO{
	public /*final*/ void aaa() {
		System.out.println("OO");		
	}
}
class PP extends OO{
	public void aaa() {
		System.out.println("PP");
	}
}
public class Ex08 {
	public static void main(String[] ar) {
		PP pp = new PP();
		pp.aaa();
		
	}
}
