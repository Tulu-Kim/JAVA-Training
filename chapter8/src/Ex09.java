//객체화된 파일을 받는 클래스
import java.io.*;
public class Ex09 {
	public static void main(String[] ar)throws IOException{
		File f = new File("ddd.txt");
		FileInputStream fsi=new FileInputStream(f);
		//f에 대한 sream 권한을 열겠다는  표현
		BufferedInputStream bis = new BufferedInputStream(fsi,1024);
		
		ObjectInputStream ois=new ObjectInputStream(bis);
		Object obj=null;
	try {
		obj=ois.readObject();
	}catch(ClassNotFoundException e) {}
	
	AAA ap=(AAA)obj;//AAA형으로 변경한 obj
	System.out.println("ap.x="+ap.x);
	System.out.println("ap.y="+ap.y);
	System.out.println("ap.z="+ap.z);
	
	}
}
