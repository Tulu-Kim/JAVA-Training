import java.io.*;
public class Ex04 {
	public static void main(String[] ar)throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		BufferedWriter bw =new BufferedWriter(osw,1024);
		PrintWriter pw=new PrintWriter(bw); //�ֿܼ� ��µǴ� ��üŰ pw�� ����

		File f = new File("ccc.txt");//���� ��ü�� ����
		FileWriter fw = new FileWriter(f);//for 2byte������ fileWriter��
		BufferedWriter bw1 = new BufferedWriter(fw);
		PrintWriter pw1 = new PrintWriter(bw1);//�̰��� ���Ͽ� ���ٴ°�.
		
		pw.println(10);
		pw.println("�ȳ��ϼ���. �ݰ����ϴ�.");
		
		pw1.println(10);
		pw1.println("�ȳ��ϼ���. �ݰ����ϴ�.");
		pw.close();
		pw1.close();
		
	}

}
