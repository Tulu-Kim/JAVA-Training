//Thread의 메소드 예제

class AA extends Thread{
	public void run() {
		System.out.println("\nAA");
		System.out.println("count="+Thread.activeCount());
		System.out.println("cut");
		
		Thread[] th = new Thread[Thread.activeCount()];
		Thread.enumerate(th);
		for(int i =0;i<th.length;++i) {
			System.out.println("i="+th[1]);
		} 
		
		System.out.println("AA EXD!");
	}
}

public class Ex03 {
	public static void main(String[] ar) {
		System.out.println("Main Start~~! ");
		
		AA ap=new AA();
		
	int x=Thread.activeCount();
	System.out.println("count="+x);
	
	//System.out.println("cur Thread="+Thread.currentThread());
	
	try {
		Thread.sleep(3000);
	}catch(InterruptedException e) {}
	ap.setPriority(Thread.MAX_PRIORITY);
	ap.setDaemon(true);
	ap.start();
	}
}
