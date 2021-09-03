//다차원배열(2차)부가적 예제
public class Ex18 {
	public static void main(String[] ar) {
		int [][] a = new int[3][2];
		int z=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=z;
				z=z+1;
				
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("a["+i+"]["+j+"]="+a[i][j]);
				
			}
		}
	}

}
