class Car02{
	private String color;
	private int speed=0;
	public void Car1() {	
	}
	public void Car2(String c) {
		color=c;	
	}
	public void Car3(String c, int s) {
		color=c;
		speed=s;	
	}
	public String get_Color(){
		return color;
	}
	public int get_Speed(){
		return speed;
	}	
}
public class Car_02 {
	public static void main(String[] ar) {
		Car02 car = new Car02();
		car.Car1();
		System.out.println("�ڵ���1�� ������"+car.get_Color()+"�̸� ����ӵ���"+car.get_Speed()+"�Դϴ�.");
		car.Car2("����");
		System.out.println("�ڵ���2�� ������"+car.get_Color()+"�̸� ����ӵ���"+car.get_Speed()+"�Դϴ�.");
		car.Car3("����",30);
		System.out.println("�ڵ���3�� ������"+car.get_Color()+"�̸� ����ӵ���"+car.get_Speed()+"�Դϴ�.");
	}
}

