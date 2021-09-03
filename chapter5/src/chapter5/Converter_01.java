package chapter5;
//예제 5-3
import java.util.Scanner;

abstract class Converter{//단위를 변환하는 추상 클래스 Converter
	abstract protected double convert(double src);
	abstract protected String getSrcString();//"원"
	abstract protected String getDestString();//"달러"
	protected double ratio;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + " 을"+ getDestString()+"로 바꿉니다.");
		System.out.println(getSrcString() + "을 입력하세요>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+ res + getDestString() + "입니다");
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
	public String getSrcString() {//"원"
		return "원";
	}
	public String getDestString() {//"달러"
		return "달러";
	}
}


public class Converter_01 {
	public static void main (String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
		}
}
