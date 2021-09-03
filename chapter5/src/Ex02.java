//자바의 클래스에  상속의 필요성
class AA{
	int x =100;
	int y=250;
	int z=10;
}
class BB extends AA{
	AA ap=new AA();
	int y=200;
	int x =1000;

}
class CC extends BB{
	BB bp=new BB();
	int z =300;
}
public class Ex02 {
	public static void main(String[] ar) {
		CC cp = new CC();
		System.out.println("z="+cp.z);
		System.out.println("y="+cp.y);
		System.out.println("x="+cp.x);
		
	}
}
