//���� 10���� �����ϴ� �迭�� ����� 1~10���� ������ ������ �����ϰ�
//�����Ͽ� �迭�� �����϶� �׸��� �迭�� �� ���ڵ�� ����� ���Ͻÿ�?
//(��Ʈ: int i=(int)(Math.random()*10+1);)

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
		System.out.println("�� : "+sum+'\t'+"��հ� : "+sum/Array.length);
	}

}
