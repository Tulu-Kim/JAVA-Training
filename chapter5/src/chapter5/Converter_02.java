package chapter5;
//예제 5-4
class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		super.ratio = ratio;
	}
	public double convert(double src) {
		return src/super.ratio;
	
	}
	public String getSrcString() {//"원"
		return "Km";
	}
	public String getDestString() {//"달러"
		return "mile";
	}
}

public class Converter_02 {
	public static void main(String args[]) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
