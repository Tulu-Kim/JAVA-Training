package chapter5;
//����5-6
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
		System.out.println("�⺻ ������ ��� �ɷ���"+weapon.fire());
		
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ���"+weapon.fire());
	}

}
