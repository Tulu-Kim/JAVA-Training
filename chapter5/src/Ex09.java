//오버라이딩의 접근에 대한 규정
//접근제한자 우선순위 private>package>protected>public
class UU{
	void aaa() {
		System.out.println("aaa");
	}
}
class VV extends UU{
	void aaa() {
		System.out.println("UU");
	}
}
public class Ex09 {

}
