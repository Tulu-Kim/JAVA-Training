//�Է¿�ҿ� ��¿�ҷ� ǥ���ϴ� io Ŭ������ ����
import java.io.*;
public class Ex05 {
	public static void main(String [] ar)throws IOException {
		//Ű����κ��� �Է¹޴°��� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//���Ϸκ��� �Էº��� ��ü�� �����ϰ��� ��
		File f=new File("ccc.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br1 = new BufferedReader(fr);
		
		
		System.out.println("���ڿ�=");
		String str=br.readLine(); 
		System.out.println("str="+str);
		
		System.out.print("���ڴ�=");
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
