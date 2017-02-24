package java.basics;

import java.util.Scanner;

public class DecisionControl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a number to check if it is positive or negative : ");

		int i = in.nextInt();

		if (i > 0) {
			System.out.println("You have entered " + i + ". It is a POSITIVE number.");
		} else if (i < 0) {
			System.out.println("You have entered " + i + ". It is a NEGATIVE number.");
		} else
			System.out.println("You have entered " + i + " (ZERO)");
		
		in.close();
	}
}
