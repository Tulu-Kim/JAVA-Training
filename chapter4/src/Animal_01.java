class Ani01{
	  private String type;
	  private int age;
	   
	   void move() {
	      System.out.println(this.type+"�� �����Դϴ�.");
	   }
	   
	   int get_Age() {
		      
		   return this.age;
		   }
	   String get_Type() {
		      
		   return this.type;
		   }
       
	   void in_Type(String t) {
          type =t;
	   }
	   void in_Age(int a) {
		  age=a;
	   }
	  
	   
	   
}
public class Animal_01 {
	public static void main(String[] ar) {
		Ani01 pt = new Ani01();
		pt.in_Type("�۸���");
		pt.in_Age(2);

		pt.move();

		Ani01 pt1 = new Ani01();
		pt1.in_Type("�����");
		pt1.in_Age(5);
		pt1.move();

		System.out.println(pt.get_Type() + "��" + pt.get_Age() + "�����Դϴ�.");
		System.out.println(pt1.get_Type() + "��" + pt1.get_Age() + "�����Դϴ�.");
	}
}	