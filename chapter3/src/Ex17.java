//�������迭//

public class Ex17 {
	public static void main(String[] ar) {
		double score[][]= {{3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
		
		double sum=0;
		for(int year=0;year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				sum += score[year][term];
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	int n=score.length;
	int m=score[0].length;
	System.out.println("�迭�� �ళ����"+score.length+'\t'+"�迭�� ��������"+score[0].length);
	System.out.println("4�г� ���������"+sum/(n*m));
	}

}
