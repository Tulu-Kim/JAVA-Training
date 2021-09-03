//class를 사용하는 방법 , 객체화 시키는 방법.
class AA{
	int a=100, b=200,c=300;
	
	void aaa() {
		System.out.print(a+":"+b+":"+c);
	}
}
class BB{
	int a=500,b=1000;
}
public class Ex02 {
	public static void main(String[] ar) {
		AA ap=new AA();//AA 라는 클래스를 ap라는 이름으로 캑체키화시킨것
		BB bp=new BB();
		System.out.println("ap.a="+ap.a);//100
		System.out.println("ap.b="+ap.b);//200
		System.out.println("ap.c="+ap.c);//300
		System.out.println("bp.a="+bp.a);//500
		System.out.println("bp.b="+bp.b);//1000
		ap.aaa();//객체 AA의 메소드 aaa
		
		
	}

}
