//Ex03을 활용한 오버로딩의 기능
public class Ex04 {
	public static void main(String[] ar) {
		Ex03 ex=new Ex03();
		Ex03 ex1=new Ex03(100);
		Ex03 ex2=new Ex03(100,200);
		
		ex.disp();//x=10,y=20
		ex1.disp();//x=100,y=20
		ex2.disp();//x=100,y=200

	}

}
