package edu.nvcc.date;

import javax.swing.JOptionPane;

public class CalendarRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input
		getMonthHelper();
	}
	
	public static void getMonthHelper() {
		int num;
		//do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Enter a number"));
			// process
			if (num!=0) {
				getMonth(num);
			} else {
				System.exit(0);
			}
		//} while (num != 0);
	}

	public static void getMonth(int num) {
		// process & output
		switch (num) {
		case 0:
			System.exit(0);
		case 1:
			JOptionPane.showMessageDialog(null, "January");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "February");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "March");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "April");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "May");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "June");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "July");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "August");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "September");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "October");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "November");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "December");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
		getMonthHelper();
	}

}
