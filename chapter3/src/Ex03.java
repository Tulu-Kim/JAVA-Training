//1-100 까지의 짝수합 혹은 홀수의 합//
public class Ex03 {
	public static void main(String[] ar) {
		int sum=0;
		for (int i=1;i<=100;i++) {
			if(i%2==1)
				sum+=i;
				
		}
		System.out.println("sum="+sum);
		
	}
}