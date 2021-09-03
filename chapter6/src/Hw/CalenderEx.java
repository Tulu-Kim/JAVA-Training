package Hw;
import java.util.Calendar;
//HW03
public class CalenderEx {
	public static void main(String[] ar) {
		String[] weekDay = {"일","월","화","수","목","금","토"};
		Calendar cal =Calendar.getInstance();
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int num = cal.get(Calendar.DAY_OF_WEEK)-1;
		String today = weekDay[num];
		System.out.println("오늘은"+month+"월"+day+"일 "+today+"요일입니다.");
	}
}
