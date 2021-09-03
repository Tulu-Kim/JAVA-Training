package Point_04_08;
//���� 5-7
class Point3D extends Point{
	int z ;
	public Point3D(int x,int y,int z) {
		super(x,y);
		this.z=z;
	}
	public void move(int x, int y,int z) {
		move(x,y);
		this.z=z;
	}
	public void moveUp() {
		z+=1;
	}
	public void moveDown() {
		z-=1;
	}
	
	public String  toString() {
		return "("+getX()+","+ getY()+","+z+")�� ��";
	}
}




public class point03 {
	public static void main(String[] args) {
	Point3D p = new Point3D(1,2,3);
	System.out.println(p.toString()+"�Դϴ�.");
	
	p.moveUp();
	System.out.println(p.toString()+"�Դϴ�.");
	
	p.moveDown();
	p.move(10,10);
	System.out.println(p.toString()+"�Դϴ�.");
	
	p.move(100,200,300);
	System.out.println(p.toString() +"�Դϴ�.");
}
}
