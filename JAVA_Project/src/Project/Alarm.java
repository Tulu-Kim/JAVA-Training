package Project;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Alarm {

	public static void main(String[] ar) {

		Calendar cal = Calendar.getInstance();

		int beaconH = cal.get(Calendar.HOUR_OF_DAY);
		int beaconM = cal.get(Calendar.MINUTE);
		int beaconS = cal.get(Calendar.SECOND);
		if (((beaconH == 13) || (beaconH == 16)) && (beaconM == 46) && (beaconS == 35)) {
			JOptionPane.showMessageDialog(null, "비콘 출결 시간입니다.");
		}

		System.out.println(beaconH);
		System.out.println(beaconM);
		System.out.println(beaconS);

	}
}
