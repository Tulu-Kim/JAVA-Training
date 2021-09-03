package chapter5;
//���� 5-4
class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		super.ratio = ratio;
	}
	public double convert(double src) {
		return src/super.ratio;
	
	}
	public String getSrcString() {//"��"
		return "Km";
	}
	public String getDestString() {//"�޷�"
		return "mile";
	}
}

public class Converter_02 {
	public static void main(String args[]) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
