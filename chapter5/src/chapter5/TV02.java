package chapter5;
//�ǽ����� 5-2
class IPTV extends ColorTV{
	String ip;
	public IPTV(String ip,int size,int color) {
		super(size,color);
		this.ip=ip;
}
	public void printProperty() {
		System.out.println("���� IPTV�� "+ip+" �ּ��� "+getSize()+"��ġ "+color+"�÷�");
}
}
public class TV02 {
	public static void main(String[] ar) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		
		iptv.printProperty();
	}
}
