//interface?
interface DDD{//다중상속을 위한 최적의 멤ㅁ버필드를 가지게됨
	//static final로 정의가 되어버림.
	public static int w=0;
	public static final int x=100;
	public final int y=200;
	public int z = 300;
	
	//void ddd() {} 내용정의부에서의 매서서든 허용이 않됨(객체생성이 안됨)
	public static class Inner{}//내무의 이너클래스는 가능., (유일한 블록의 소유자)
	//상속시킬 메서드를 정의를 함.
	public abstract void aaa();
	public void bbb();
	void ccc();
}

public class Ex13 {
	public static void name(String[] ar) {
		System.out.println("w="+DDD.w);
		System.out.println("x="+DDD.x);
		System.out.println("y="+DDD.y);
		System.out.println("z="+DDD.x);
		
	}
}
