package Hw;
//HW08
public class StringBufferEx {
 public static void main(String [] ar) {
	 StringBuffer sb = new StringBuffer("Welcome to");
	 
	 sb.append(" java");
	 System.out.println(sb);
	 sb.insert(0,"Yes~! ");
	 System.out.println(sb);
	 sb.replace(6,13,"Good");
	 System.out.println(sb);
	 sb.delete(0,11);
	 //sb.setLength(" ");//스트링버퍼 길이 수정
	 System.out.println(sb);
	 		 
 }
}
