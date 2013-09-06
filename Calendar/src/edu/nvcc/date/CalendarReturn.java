package edu.nvcc.date;

import javax.swing.JOptionPane;

public class CalendarReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input
		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Enter a number"));
			// process & output
			JOptionPane.showMessageDialog(null,getMonth(num));
		} while (num != 0);
	}

	public static String getMonth(int num) {
		// process & output
		String month;
		switch (num) {
		case 0:
			System.exit(0);
		case 1:
			month = "January";
			break;
		case 2:
			month =  "February";
			break;
		case 3:
			month =  "March";
			break;
		case 4:
			month =  "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month =  "June";
			break;
		case 7:
			month =  "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month =  "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month =  "December";
			break;
		default:
			month =  "Invalid Input";
		}
		return month;
	}

}
