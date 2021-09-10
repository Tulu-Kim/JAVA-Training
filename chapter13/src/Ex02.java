//Runnable에 의한 쓰데드 생성하기
class B extends Object implements Runnable{
	public void run() {
		System.out.println("B");
	}
	
}

public class Ex02 {
	public static void main(String[] ar) {
		System.out.println("main start!");
		B bp=new B();
		bp.run();
		//bp.start();
		Thread th=new Thread(bp);
		 th.start();
	
		 for(int i=0;i<100;++i ) {
			 System.out.print(i);
			 if(i%10==0) System.out.println();
		    	else System.out.print('\t');

		 }
	
		 
	}	
	}
	    
