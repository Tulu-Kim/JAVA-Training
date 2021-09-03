//매서드의 오버로딩과 재정의
class FF{
	private int x;
	private int y;
	public void setXY(int x) {//메소드1<--
		this.x=x;
		this.y=100;
	}
	public void setXY(int x,int y) {//메소드2
		this.x=x;
		this.y=y;
	}
	 
}
class HH extends FF{
	 public void setXY(int x) {
		 //내용정의부(메소드 오버라이딩-->)
	 }
}
public class Ex06 {
	public static void main(String[] ar) {
		FF fp=new FF();
		fp.setXY(100);//메소드1이 선택
		fp.setXY(100,200);//메소드2가 선택-> 메소드 오버로링
	}
	

}
