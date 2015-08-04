package com.puzzle.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The class to determine whether an array of integers satisfy A + B = C + D, where A, B, C & D are integers values in the array.
 * @author amitsuvalka
 *
 */
public class QuadrupletPuzzle {
	private int[] inputArray;

	/**
	 * Method to determine whether an array of integers satisfy A + B = C + D, where A, B, C & D are integers values in the array.
	 * 
	 * @return    List of Strings
	 */
	public List<String> findQuadrupletIdx() {
		if (this.getInputArray() == null) return null;

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

	public int[] getInputArray() {
		return inputArray;
	}

	public void setInputArray(int[] inputArray) {
		this.inputArray = inputArray;
	}
}
