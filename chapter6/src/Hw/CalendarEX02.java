package Hw;
//HW10
import java.util.Calendar;
public class CalendarEX02 {
	public static void main(String[] ar) {
		//String[] weekDay = {"��","��","ȭ","��","��","��","��"};
		String Good;
		Calendar cal =Calendar.getInstance();
		int hourOfDay=cal.get(Calendar.HOUR_OF_DAY);
		//int hourOfDay = 19;
		if(hourOfDay>=4&&hourOfDay<=12) 
			Good = "Good Mornning";
		else if(hourOfDay<18) 
			Good = "Good Afternoon";
		else Good = "Good Night";
		System.out.println("����ð���"+hourOfDay+"�� �Դϴ�.");
		System.out.println(Good);
	}
}


