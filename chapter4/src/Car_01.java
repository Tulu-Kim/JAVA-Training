class Car{
	String color;
	int speed=0;
	public void Car1() {
		
	}
	public void Car2(String c) {
		color=c;
		
	}
	public void Car3(String c, int s) {
		color=c;
		speed=s;
		
	}
}
public class Car_01 {
	public static void main(String[] ar) {
		Car car = new Car();
		
		
		car.Car1();
		System.out.println("�ڵ���1�� ������"+car.color+"�̸� ����ӵ���"+car.speed+"�Դϴ�.");
		car.Car2("����");
		System.out.println("�ڵ���2�� ������"+car.color+"�̸� ����ӵ���"+car.speed+"�Դϴ�.");
		car.Car3("����",30);
		System.out.println("�ڵ���3�� ������"+car.color+"�̸� ����ӵ���"+car.speed+"�Դϴ�.");
	}
}
