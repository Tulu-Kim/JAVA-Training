//File class�� �޼ҵ� ����
import java.io.*;

public class Ex03 {
	public static void main(String[] ar)throws IOException {
		File f=new File("C:\\CookJava\\chapter8\\aaa.txt");//�� ������ ������ �մ��� �޼ҵ�� Ȯ���ϱ�
		
		System.out.println("read "+f.canRead());
		System.out.println("Write? "+f.canWrite());
		
		File f1=new File("aaa.txt");// ���� aaa�� ����
		
		try {
		boolean bool=f1.createNewFile();
		System.out.println("bool="+bool);
		}catch(IOException e){}
		
		File ff=new File(".");//���� ���丮
		try {
		File f2 =File.createTempFile("temp",".jyw",ff);//aaa �����ʰ� ���ÿ� ������
		}catch(IOException e) {}
		
      	boolean bool=f1.delete();
		System.out.println("bool="+bool);
      	
		//f1.deleteOnExit();
      	//try {
      	//	Thread.sleep(3000);
      	//}catch(InterruptedException e) {}

		
		String[] s=ff.list();
		for (int i=0;i<s.length;i++)
			System.out.println(i+":"+s[i]); //���� ����Ʈ �̱�
		
		File f3 = new File("aaa");
		f3.mkdir();
		File f4=new File("bbb/ccc/ddd/eee");
		f4.mkdirs(); // aaa���� ����� / �׸��� bbb ccc ddd eee ������ ������ ���� �����
		
			
	}
}