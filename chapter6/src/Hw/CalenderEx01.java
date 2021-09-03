package Hw;
import java.util.Calendar;

//HW04
public class CalenderEx01 {
	public static void main(String[] ar) {
		//String[] weekDay = {"일","월","화","수","목","금","토"};
		Calendar cal =Calendar.getInstance();
		int hourOfDay=cal.get(Calendar.HOUR_OF_DAY);
		//int ampm=cal.get(Calendar.AM_PM);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		//int month=cal.get(Calendar.MONTH);
		//int day=cal.get(Calendar.DAY_OF_MONTH);
		//int num = cal.get(Calendar.DAY_OF_WEEK)-1;
		//String today = weekDay[num];
		System.out.println("현재시간은"+hourOfDay+"시"+minute+"분 "+second+"초 입니다.");
	}
}
