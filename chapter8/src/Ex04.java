import java.io.*;
public class Ex04 {
	public static void main(String[] ar)throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		BufferedWriter bw =new BufferedWriter(osw,1024);
		PrintWriter pw=new PrintWriter(bw); //콘솔에 출력되는 객체키 pw를 생성

		File f = new File("ccc.txt");//파일 객체를 만듬
		FileWriter fw = new FileWriter(f);//for 2byte에대한 fileWriter임
		BufferedWriter bw1 = new BufferedWriter(fw);
		PrintWriter pw1 = new PrintWriter(bw1);//이것은 파일에 쓴다는것.
		
		pw.println(10);
		pw.println("안녕하세요. 반갑습니다.");
		
		pw1.println(10);
		pw1.println("안녕하세요. 반갑습니다.");
		pw.close();
		pw1.close();
		
	}

}
