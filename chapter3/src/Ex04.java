public class Ex04 {
	public static void main(String[] ar) {
		int sum=0, tot=0;
		for (int i=1;i<=100;i++) {
			if(i%2==1)
				sum+=i;
				
		}
		System.out.println("sum="+sum);
		
		for(int j=1;j<=100;j++) {
			if(j%2==0) {
				tot+=j;
			}
		}
		System.out.println("sum="+tot);
	}
}