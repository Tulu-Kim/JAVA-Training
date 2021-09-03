package chapter5;
//실습문제 5-1
class TV{
	private int size;
	public TV(int size){
		this.size=size;
		}
	protected int getSize() {
		return size;
		}
}

class ColorTV extends TV{
    int color;
	public ColorTV(int size,int color) {
		super(size);
		this.color=color;	
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
	
}
public class TV01 {
	public static void main(String[] ar) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}

}
