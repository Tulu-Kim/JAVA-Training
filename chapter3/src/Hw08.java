
public class Hw08 {
public static void main(String[] ar) {
	int [] x = new int[3];
	
	try {
	x[4]=6;
}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("�迭�� �ε����� ������ ������ϴ�.");
	}
}
}
