package Ex;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int days,weeks,years;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of days :");
		days = sc.nextInt();
		
		// Convert days to years, weeks and days
		years = days / 365; // calculate years
		weeks = (days % 365) / 7; // calculate weeks
		days = days - ((years * 365) + (weeks * 7)); // calculate days
		
		//prints the result
		System.out.println("Years : " + years);
		System.out.println("Weeks : " + weeks);
		System.out.println("Days  : " + days);
		sc.close();
	}

}
