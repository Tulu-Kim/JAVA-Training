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
		System.out.println("자동차1의 색상은"+car.color+"이며 현재속도는"+car.speed+"입니다.");
		car.Car2("빨강");
		System.out.println("자동차2의 색상은"+car.color+"이며 현재속도는"+car.speed+"입니다.");
		car.Car3("빨강",30);
		System.out.println("자동차3의 색상은"+car.color+"이며 현재속도는"+car.speed+"입니다.");
	}
}
