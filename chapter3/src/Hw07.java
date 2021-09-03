//정수 10개를 저장하는 배열을 만들고 1~10까지 범위의 정수를 랜덤하게
//생성하여 배열에 저장하라 그리고 배열에 든 숫자들과 평균을 구하시오?
//(힌트: int i=(int)(Math.random()*10+1);)

public class Hw07 {
	public static void main(String[] ar) {
		int[] Array=new int[10];
		int j=0,sum=0;
		for(int i=0;i<Array.length;++i) {
			j=(int)(Math.random()*10+1);
			Array[i]=j;
			sum +=Array[i];
			System.out.println("Array["+i+"]="+Array[i]);
		}
		System.out.println("합 : "+sum+'\t'+"평균값 : "+sum/Array.length);
	}

}
