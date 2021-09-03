package chapter5;
//¿¹Á¦5-5
class Shape{
	public Shape next;
	public Shape() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}	
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class Hw01_5_05 {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] ar) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
