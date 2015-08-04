package com.puzzle.gui;

import java.util.List;

import com.puzzle.logic.QuadrupletPuzzle;

public class GuiExecute {

	public static void main(String[] args) {
		QuadrupletPuzzle puzzle = new QuadrupletPuzzle();
		int[] intArray = GuiInput.getIntegerArrFromConsole();
		puzzle.setInputArray(intArray);

		List<String> output = puzzle.findQuadrupletIdx(); 
		if (output != null && !output.isEmpty()) {
			System.out.println("Given array contains following Quadruplet of indexes :\n");
			for (String temp : output) {
				System.out.println(temp);
			}
		} else {
			System.out.println("No such Quadruplet exists in given array !!");			
		}
	}
}
