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
		System.out.println("자동차1의 색상은"+car.get_Color()+"이며 현재속도는"+car.get_Speed()+"입니다.");
		car.Car2("빨강");
		System.out.println("자동차2의 색상은"+car.get_Color()+"이며 현재속도는"+car.get_Speed()+"입니다.");
		car.Car3("빨강",30);
		System.out.println("자동차3의 색상은"+car.get_Color()+"이며 현재속도는"+car.get_Speed()+"입니다.");
	}
}

