//����ȭ(Synchronization)
package Hw;
class K extends Thread{
	private int x = 100;
	public synchronized void setX(int x) {
		this.x+=x;
		
	}
	public synchronized int getX() {
		return x;
	}
	public void  run() {//Ŭ���� k���� �̰� ���� �޼ҵ����� ����
		synchronized (this){
			setX(200);
			System.out.println("x="+getX());
		}
	}
}
public class Ex05 {
	public static void main(String[] ar) {
	K kp =  new K();
	kp.start();
	}	
}
