class TV{
	String name;
	int year=0,inch=0;
	
	public TV(String n,int y,int i) {
		year=y;
		inch=i;
		name=n;
	}
	public void show() {
	System.out.println(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
}
}
public class Tv_test{
	public static void main(String[] args) {
		TV myTV=new TV("LG",2017,32);
		myTV.show();
	}
	
}

