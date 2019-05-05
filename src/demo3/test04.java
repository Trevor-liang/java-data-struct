package demo3;

import java.util.Calendar;

public class test04 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		int month = now.get(Calendar.MONTH) + 1;
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("当前季节为春季！");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("当前季节为夏季！");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("当前季节为秋季！");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("当前季节为冬季！");
			break;
		default:
			System.out.println("ERROR!");
		}

	}

}
