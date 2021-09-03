//File class의 메소드 예제
import java.io.*;

public class Ex03 {
	public static void main(String[] ar)throws IOException {
		File f=new File("C:\\CookJava\\chapter8\\aaa.txt");//이 파일을 릭을수 잇는지 메소드로 확인하기
		
		System.out.println("read "+f.canRead());
		System.out.println("Write? "+f.canWrite());
		
		File f1=new File("aaa.txt");// 현제 aaa는 없음
		
		try {
		boolean bool=f1.createNewFile();
		System.out.println("bool="+bool);
		}catch(IOException e){}
		
		File ff=new File(".");//현제 디렉토리
		try {
		File f2 =File.createTempFile("temp",".jyw",ff);//aaa 생성됨과 동시에 삭제됨
		}catch(IOException e) {}
		
      	boolean bool=f1.delete();
		System.out.println("bool="+bool);
      	
		//f1.deleteOnExit();
      	//try {
      	//	Thread.sleep(3000);
      	//}catch(InterruptedException e) {}

		
		String[] s=ff.list();
		for (int i=0;i<s.length;i++)
			System.out.println(i+":"+s[i]); //파일 리스트 뽑기
		
		File f3 = new File("aaa");
		f3.mkdir();
		File f4=new File("bbb/ccc/ddd/eee");
		f4.mkdirs(); // aaa폴더 만들기 / 그리고 bbb ccc ddd eee 순으로 폴더속 폴더 만들기
		
			
	}
}