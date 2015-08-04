package com.puzzle.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.puzzle.gui.GuiInput;

public class QuadrupletPuzzle {

	public static void main(String[] args) {
		QuadrupletPuzzle puzzle = new QuadrupletPuzzle();
		int[] intArray = GuiInput.getIntegerArrFromConsole();
		List<String> output = puzzle.findQuadrupletIdx(intArray);
		if (output != null && !output.isEmpty()) {
			System.out.println("Given array contains following Quadruplet of indexes :\n");
			for (String temp : output) {
				System.out.println(temp);
			}
		} else {
			System.out.println("No such Quadruplet exists in given array !!");			
		}
	}

	public List<String> findQuadrupletIdx(int[] inputArray) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		List<String> output = new ArrayList<String>();
		for (int i = 0; i < inputArray.length - 3; i++) {
			for (int j = i+1; j < inputArray.length - 2; j++) {
				if ((map.get(new Integer(inputArray[i]+inputArray[j])) != null)) {
					map.put(new Integer(inputArray[i]+inputArray[j]), map.get(new Integer(inputArray[i]+inputArray[j]))+"|"+i+","+j);
				} else {
					map.put(new Integer(inputArray[i]+inputArray[j]), i+","+j);
				}
			}
		}

		for (int i = 2; i < inputArray.length - 1; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				if (map.get(new Integer(inputArray[i]+inputArray[j])) != null) {
					for (String index : map.get(new Integer(inputArray[i]+inputArray[j])).split("\\|")) {
						String[] mixIndex = index.split(",");
						if (Integer.parseInt(mixIndex[1]) < i) {
							output.add("(" + mixIndex[0] + "," + mixIndex[1] + "," + i + "," + j + ")");
						}
					}
				}
			}
		}
		return output;
	}
}
