package com.puzzle.gui;

import java.util.Scanner;

public class GuiInput {

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
