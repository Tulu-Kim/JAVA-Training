//this,this()ÀÇ ¿¹Á¦
public class Ex06 {
	public static void main(String[] ar) {
		Ex05 ex = new Ex05();//x=10,y=20
		Ex05 ex1= new Ex05(100);//x=100,y=20
		Ex05 ex2= new Ex05(100,200);//x=100,y=200
		
		ex.disp();
		ex1.disp();
		ex2.disp();
		
		
	}

}
