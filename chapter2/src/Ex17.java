//����,��Ʈ �� ������?//
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
//& : ��Ʈ�� ������, && : ����� ������.
		boolean bool=aaa() & bbb();
	System.out.printf("bool="+bool);
	}
}
