//��üȭ ��Ű�� Ŭ����
import java.io.*;
class AAA implements Serializable{
	int x=100;
	int y=200;
	int z=300;
	
}
public class Ex08 {
	public static void main(String[] ar)throws IOException {
		AAA ap=new AAA(); // ap��� ��ü�� ������ ���� ������? ����
		
		//�ϴ� ���� ��ü�� �ϳ� ���� ���⿡ ��������.
		File f = new File("ddd.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		
		oos.writeObject(ap);
		oos.close();
		System.out.println("��¿Ϸ�");
		
	}
}
