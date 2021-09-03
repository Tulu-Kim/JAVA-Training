//final메소드의 예쩨,사용법
class Ex09_sub{
	private final double pi=3.14;
	
	public void setPi(double pi) {
		//this.pi=pi;
		}
	public double getpi() {
		return pi;
	}
}
public class Ex09 {
	public static void main(String[] ar) {//메인 메서드
		Ex09_sub ex=new Ex09_sub();
		ex.setPi(41.14159); //Ex09_sub에서 final 필드로 3.14로 초기화 되어있음
		System.out.println("pi="+ex.getpi());
		
		
	}

}
