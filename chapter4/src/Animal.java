/*강아지가 움직입니다.
 고양이가 움직입니다.
 강아지는 8개월 입니다.
 고양이는 13개얼 입니다.*/

class Ani{
	   String type;
	   int age;
	   
	   void move() {
	      System.out.println(this.type+"가 움직입니다.");
	   }
	   
	   int get_Age() {
	      return this.age;
	   }
	}
	public class Animal {
		public static void main(String[] ar) {
			  Ani pt=new Ani();
		      pt.type="강아지";
		      pt.age=8;
		      pt.move();
		      
		      Ani pt1=new Ani();
		      pt1.type="고양이";
		      pt1.age=13;
		      pt1.move();
		      
		      System.out.println(pt.type+"는"+pt.age+"개월입니다.");
		      System.out.println(pt1.type+"는"+pt1.age+"개월입니다.");
		   }
	}