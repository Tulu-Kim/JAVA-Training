//�ǽ����� 8-9
package Hw;
import java.io.File;

public class FileDeleteEx {

	public static void main(String[] args) {
		File dir = new File("c:\\temp\\");
		File [] files = dir.listFiles(); 
		
		System.out.println(dir.getPath() + "���͸��� .txt ������ ��� �����մϴ�....");
		int count = 0;
		for(int i=0; i<files.length; i++) {
			if(!files[i].isFile()) 
				continue;
			
			String name = files[i].getName();
			int index = name.lastIndexOf('.');
			if(index == -1) 
				continue;
			
			String ext = name.substring(index); 
			if(ext.equals(".txt")) {
				System.out.println(files[i].getPath() + " ����");
				files[i].delete();
				count++;
			}
		}
		System.out.println("�� "+ count + "���� .txt ������ �����Ͽ����ϴ�.");
	}
}


