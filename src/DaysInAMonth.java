import java.util.Scanner;

/**
 * Create a program that displays the number of days in a particular month.
 * 
 * Prompt the user to first enter a number between 1 and 12 where 1 is January,
 * 2 is February, and so on.
 * 
 * Prompt the user to enter the year.
 * 
 * In most cases, the year won't matter except for February. You will need to
 * determine, based on the year, if February has 28 or 29 days.
 * 
 * Hint: If the year IS evenly divisible by 100 AND evenly divisible by 400, it
 * is a leap year. If the year is NOT evenly divisible by 100 but IS evenly
 * divisible by 4, it is a leap year.
 * 
 * @author Josh Alcoba
 */
public class DaysInAMonth {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		boolean isLeapYear = false;
		int yearEntered = 0;
		int monthEntered = 0;
		int numberOfDays = 0;

		System.out.println("Please enter the month (1-12): ");
		monthEntered = keyboard.nextInt();

		System.out.println("Please enter the year: ");
		yearEntered = keyboard.nextInt();
		keyboard.close();

		if ((yearEntered % 100 == 0 && yearEntered % 400 == 0) || yearEntered % 4 == 0)
			isLeapYear = true;

		switch (monthEntered) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numberOfDays = 31;
			break;
		case 2:
			if (!isLeapYear)
				numberOfDays = 28;
			else
				numberOfDays = 29;
			break;
		default:
			numberOfDays = 30;

		}

		System.out.println("Number of days: " + numberOfDays);

		/***
		 * SAMPLE OUTPUT/INPUT ***
		 * 
		 * Please enter the month (1-12): 2 
		 * Please enter the year: 2016 
		 * Number of days: 29
		 * 
		 */
	}

}
