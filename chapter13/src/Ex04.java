//������ �޽�带 �����ϱ����� �ð� ����
import java.util.*;
import java.text.*;

class AAA extends Thread{
	public void run() {
		while(true) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
			Date d = new Date();
			String str= format.format(d);
			
			System.out.println("�����ð�:"+str);
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {}
			
		}
	}
}

public class Ex04 {
	public static void main(String[] ar) {
		System.out.println("Main start~!!!");
		
		AAA ap=new AAA();
		ap.setDaemon(true);//
		
		ap.start();
		
		try {
			ap.join(5000);//ap��� ��ü���� 5�� ���
			Thread.sleep(3000);//3���۵�
		}catch(InterruptedException e) {}
		System.out.println("Main End~!");
	}

}
