package Hw;
//HW09
import java.util.StringTokenizer;
public class StringTokenizerEX {
	public static void main(String [] ar) {
		String Phone = "���� �ڵ��� ��ȭ��ȣ�� 010-1234-5673 �Դϴ�.";
		StringTokenizer st = new StringTokenizer(Phone," -");
		int count = st.countTokens();		
		//System.out.println(count); ��ū���� ǥ��
		for(int i =0;i<count;i++) {
		System.out.println(st.nextToken());
		}
		
	}
}
