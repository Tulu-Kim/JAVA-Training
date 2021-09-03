//관계,비트 논리 연산자?//
public class Ex17 {
	public static boolean aaa() {
		System.out.println("AAA");
		return false;
		}
		
	public static boolean bbb() {
		System.out.println("BBB");
		return true;
	}
	public static void main(String[] ar) {
//& : 비트논리 연산자, && : 관계논리 연산자.
		boolean bool=aaa() & bbb();
	System.out.printf("bool="+bool);
	}
}
