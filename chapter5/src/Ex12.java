//Ex11 ������ �̸��� ����ٸ� Ŭ������ �����뿡
//������� ���°��� �߻�ȭ Ŭ������, �Ʒ� ����
 abstract class AAA{
	public abstract void aaa();
}
 class BBB extends AAA{
	 public void aaa() {
		 System.out.println("BBB");
	 }
 }
 class CCC extends AAA{
	 public void aaa() {
		 System.out.println("CCC");
	 }
 }
public class Ex12 {
	public static void main(String[] ar) {
		BBB bp=new BBB();
		CCC cp=new CCC();
		AAA ap=new BBB();//�θ� ������ �����ϴ� ����ó�� �̰��� �����ѵ� �̰Ž� �������̶�� �θ���.
		AAA ap1=new CCC();
		
		ap.aaa();
		ap1.aaa();
	}

}
