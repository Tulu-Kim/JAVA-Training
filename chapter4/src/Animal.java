/*�������� �����Դϴ�.
 ����̰� �����Դϴ�.
 �������� 8���� �Դϴ�.
 ����̴� 13���� �Դϴ�.*/

class Ani{
	   String type;
	   int age;
	   
	   void move() {
	      System.out.println(this.type+"�� �����Դϴ�.");
	   }
	   
	   int get_Age() {
	      return this.age;
	   }
	}
	public class Animal {
		public static void main(String[] ar) {
			  Ani pt=new Ani();
		      pt.type="������";
		      pt.age=8;
		      pt.move();
		      
		      Ani pt1=new Ani();
		      pt1.type="�����";
		      pt1.age=13;
		      pt1.move();
		      
		      System.out.println(pt.type+"��"+pt.age+"�����Դϴ�.");
		      System.out.println(pt1.type+"��"+pt1.age+"�����Դϴ�.");
		   }
	}