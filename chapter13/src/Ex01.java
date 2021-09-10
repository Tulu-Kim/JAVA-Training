//자바 스레드
class A extends Thread{
	public void run() {//main methood임
		System.out.println("A");
		
	}
}
public class Ex01 {
	public static void main(String[] ra) {
		System.out.println("main start!");
		
		A ap=new A();
		ap.run();//메소드 호출
		ap.start();//A클래스의 쓰레드를 호출

	    for(int i=0;i<100;++i) {
	    	System.out.print(i);
	    	if(i%10==0)System.out.println();
	    	else System.out.print('\t');
	    
	    }
	}

}
