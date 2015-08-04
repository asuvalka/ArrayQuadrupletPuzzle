package com.puzzle.gui;

import java.util.Scanner;

/**
 * This class is used to accept standard key board input.
 * @author amitsuvalka
 *
 */
public class GuiInput {

	/**
	 * Method to accept standard key board input.
	 * It only takes the integer input and flushes out any other characters.
	 * @return
	 */
	public static int[] getIntegerArrFromConsole() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of source array : ");
		int inputArrayLen = input.nextInt();

		System.out.println("Enter element of array : ");
		int[] inputArray = new int[inputArrayLen];
		for (int i = 0; i < inputArrayLen; i++) {
			if (input.hasNextInt()) {
				inputArray[i] = input.nextInt();
			} else {
				input.next();    // flush out the input other than integer.
				i--;
			}
		}
		if (input != null) input.close();

		return inputArray;
	}
}
