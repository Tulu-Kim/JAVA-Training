package chapter5;
//���� 5-3
import java.util.Scanner;

abstract class Converter{//������ ��ȯ�ϴ� �߻� Ŭ���� Converter
	abstract protected double convert(double src);
	abstract protected String getSrcString();//"��"
	abstract protected String getDestString();//"�޷�"
	protected double ratio;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + " ��"+ getDestString()+"�� �ٲߴϴ�.");
		System.out.println(getSrcString() + "�� �Է��ϼ���>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: "+ res + getDestString() + "�Դϴ�");
		scanner.close();
		}
}

class Won2Dollar extends Converter{
	public Won2Dollar(double ratio) {
		super.ratio = ratio;
	}
	public double convert(double src) {
		return src/super.ratio;
	
	}
	public String getSrcString() {//"��"
		return "��";
	}
	public String getDestString() {//"�޷�"
		return "�޷�";
	}
}


public class Converter_01 {
	public static void main (String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
		}
}
