//�ڹ� ������
class A extends Thread{
	public void run() {//main methood��
		System.out.println("A");
		
	}
}
public class Ex01 {
	public static void main(String[] ra) {
		System.out.println("main start!");
		
		A ap=new A();
		ap.run();//�޼ҵ� ȣ��
		ap.start();//AŬ������ �����带 ȣ��

	    for(int i=0;i<100;++i) {
	    	System.out.print(i);
	    	if(i%10==0)System.out.println();
	    	else System.out.print('\t');
	    
	    }
	}

}
