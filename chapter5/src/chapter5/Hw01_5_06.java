package chapter5;
//예제5-6
class Weapon{
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon{
	protected int fire() {
		return 10;
	}
}
public class Hw01_5_06 {
	public static void main(String[] ar) {
		Weapon weapon;
		weapon =new Weapon();
		System.out.println("기본 무기의 살상 능력은"+weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은"+weapon.fire());
	}

}
