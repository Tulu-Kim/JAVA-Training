package Hw;
import java.util.Calendar;
//HW03
public class CalenderEx {
	public static void main(String[] ar) {
		String[] weekDay = {"��","��","ȭ","��","��","��","��"};
		Calendar cal =Calendar.getInstance();
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int num = cal.get(Calendar.DAY_OF_WEEK)-1;
		String today = weekDay[num];
		System.out.println("������"+month+"��"+day+"�� "+today+"�����Դϴ�.");
	}
}
