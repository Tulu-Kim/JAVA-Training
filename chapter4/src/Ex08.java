//static 멤버 지정에 대한 에제
class Ex08_sub{
	private String name;
	private double don;
	private static float iyle;

	public Ex08_sub(String name,double don,float iyle) {
		this.name = name;
		this.don = don;
		this.iyle = iyle;
	}
	public void disp() {
		System.out.println("name=" + this.name);
		System.out.println("don=" + this.don);
		System.out.println("iyle=" + this.iyle);
		
	}
}
public class Ex08 {
	public static void main(String[] ar) {
		Ex08_sub ex=new Ex08_sub("A",1000,0.07f);
		ex.disp();
		System.out.println();
		Ex08_sub ex1=new Ex08_sub("B",1000.0,0.03f);
		ex.disp();
		ex1.disp();
		System.out.println();
		Ex08_sub ex2 = new Ex08_sub("c",1000.0,0.05f);
		ex.disp();
		ex1.disp();
		ex2.disp();
		
	}
	

}
