package Hw;
//���� 6-1
class Point{
	private int x,y;
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "point("+x+","+y+")";
	}
	public boolean equals(Object obj) {
		Point p =(Point)obj;
		if(x==p.x&&y==p.y)
			return true;
		else return false;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
		}
	public static void main(String [] ar) {
		Point p = new Point(2,3);
		print(p);
	}
}
