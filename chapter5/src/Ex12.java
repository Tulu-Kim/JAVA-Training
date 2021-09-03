//Ex11 에서의 이름이 각기다른 클래스의 오남용에
//대안으로 나온것이 추상화 클래스임, 아래 예제
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
		AAA ap=new BBB();//부모가 가직을 관리하는 내용처럼 이것이 가능한데 이거싱 다형성이라고 부른다.
		AAA ap1=new CCC();
		
		ap.aaa();
		ap1.aaa();
	}

}
