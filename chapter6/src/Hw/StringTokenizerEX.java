package Hw;
//HW09
import java.util.StringTokenizer;
public class StringTokenizerEX {
	public static void main(String [] ar) {
		String Phone = "나의 핸드폰 전화번호는 010-1234-5673 입니다.";
		StringTokenizer st = new StringTokenizer(Phone," -");
		int count = st.countTokens();		
		//System.out.println(count); 토큰개수 표시
		for(int i =0;i<count;i++) {
		System.out.println(st.nextToken());
		}
		
	}
}
