//��üȭ�� ������ �޴� Ŭ����
import java.io.*;
public class Ex09 {
	public static void main(String[] ar)throws IOException{
		File f = new File("ddd.txt");
		FileInputStream fsi=new FileInputStream(f);
		//f�� ���� sream ������ ���ڴٴ�  ǥ��
		BufferedInputStream bis = new BufferedInputStream(fsi,1024);
		
		ObjectInputStream ois=new ObjectInputStream(bis);
		Object obj=null;
	try {
		obj=ois.readObject();
	}catch(ClassNotFoundException e) {}
	
	AAA ap=(AAA)obj;//AAA������ ������ obj
	System.out.println("ap.x="+ap.x);
	System.out.println("ap.y="+ap.y);
	System.out.println("ap.z="+ap.z);
	
	}
}
