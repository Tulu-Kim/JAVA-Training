package Hw;
//HW10
import java.util.Calendar;
public class CalendarEX02 {
	public static void main(String[] ar) {
		//String[] weekDay = {"일","월","화","수","목","금","토"};
		String Good;
		Calendar cal =Calendar.getInstance();
		int hourOfDay=cal.get(Calendar.HOUR_OF_DAY);
		//int hourOfDay = 19;
		if(hourOfDay>=4&&hourOfDay<=12) 
			Good = "Good Mornning";
		else if(hourOfDay<18) 
			Good = "Good Afternoon";
		else Good = "Good Night";
		System.out.println("현재시간은"+hourOfDay+"시 입니다.");
		System.out.println(Good);
	}
}


