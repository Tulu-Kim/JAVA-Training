
public class Hw08 {
public static void main(String[] ar) {
	int [] x = new int[3];
	
	try {
	x[4]=6;
}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
	}
}
}
