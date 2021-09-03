//객체화 시키는 클래스
import java.io.*;
class AAA implements Serializable{
	int x=100;
	int y=200;
	int z=300;
	
}
public class Ex08 {
	public static void main(String[] ar)throws IOException {
		AAA ap=new AAA(); // ap라는 객체를 보내면 되지 않을까? 가정
		
		//일단 파일 객체를 하나 만들어서 여기에 전송하자.
		File f = new File("ddd.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		
		oos.writeObject(ap);
		oos.close();
		System.out.println("출력완료");
		
	}
}
