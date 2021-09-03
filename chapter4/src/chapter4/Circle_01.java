package chapter4;
//예제 4-3
public class Circle_01{
	int radius;
	String name;
	
	public Circle_01() {
		radius = 1; name = "";
	}
	public Circle_01(int r,String n) {
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}


public static void main(String[] args){
	Circle_01 pizza = new Circle_01(10,"자바피자");
	
	double area = pizza.getArea();
	System.out.println(pizza.name+"의 면적은 "+ area);
	
	Circle_01 donut = new Circle_01();
	donut.name = "도넛피자";
	area = donut.getArea();
	System.out.println(donut.name + "의 면적은 " + area);
	
}

}
