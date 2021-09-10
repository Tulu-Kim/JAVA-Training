//쓰레드 메쏘드를 설명하기위한 시계 예제
import java.util.*;
import java.text.*;

class AAA extends Thread{
	public void run() {
		while(true) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
			Date d = new Date();
			String str= format.format(d);
			
			System.out.println("현제시간:"+str);
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
			ap.join(5000);//ap라는 객체에게 5초 허용
			Thread.sleep(3000);//3초작동
		}catch(InterruptedException e) {}
		System.out.println("Main End~!");
	}

}
