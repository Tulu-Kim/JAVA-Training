//입력요소와 출력요소로 표현하느 io 클래스의 사용법
import java.io.*;
public class Ex05 {
	public static void main(String [] ar)throws IOException {
		//키보드로부터 입력받는것을 정의
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//파일로부터 입력부의 객체를 생성하고자 함
		File f=new File("ccc.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br1 = new BufferedReader(fr);
		
		
		System.out.println("문자열=");
		String str=br.readLine(); 
		System.out.println("str="+str);
		
		System.out.print("숫자는=");
		int x=Integer.parseInt(br.readLine());
		System.out.println("x="+x);
		
		System.out.println("#################################");
		while(true) {
			String s = br1.readLine();
			if(s==null) break;
			System.out.println("s="+s);
		}
	}

}
