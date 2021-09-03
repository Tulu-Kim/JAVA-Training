class F{
	protected int x=100;
	protected int y=200;
	protected int z=700;
	
}
class H extends F{
	private int x=300;
	private int y=400;
	private int z=500;

	public void disp() {
		System.out.println("x="+this.x);//이때x는 어떤 x인지를 알려줄 필요가 있음.
		System.out.println("y="+super.y);//상위 클래스의 y값을 의미함
		System.out.println("z="+super.z);//this.z(자기 클래스의 z),super.z(상속을준 클래스의 z) 
		
	}
}
public class Ex05{
	public static void main(String[] ar) {
		F fp=new F();
		H hp=new H();
		hp.disp();
		
	}
	
}



