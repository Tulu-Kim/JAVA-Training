import java.util.Scanner;
public class Hw03_3_6 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.print(">>");;
			String text = sc.nextLine();
			if(text.equals("exit"))
				break;
		}
	System.out.println("�����մϴ�...");
	sc.close();
	}
	
}
