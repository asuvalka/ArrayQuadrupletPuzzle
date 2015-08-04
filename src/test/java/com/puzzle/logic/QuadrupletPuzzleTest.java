package com.puzzle.logic;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class QuadrupletPuzzleTest {

	@Test
	public void testQuadrupletPuzzle() {
		int[] testArray = null;
		List<String> testOutput = null;
		List<String> testExpected = null;
		QuadrupletPuzzle puzzle = new QuadrupletPuzzle();
		
		testArray = new int[] {3,4,7,0};
		puzzle.setInputArray(testArray);
		testOutput = puzzle.findQuadrupletIdx();
		testExpected = new ArrayList<String>();
		testExpected.add("(0,1,2,3)");
		assertEquals(testExpected, testOutput);
		
		testArray = new int[] {3,4,7,1,2,9,8};
		puzzle.setInputArray(testArray);
		testOutput = puzzle.findQuadrupletIdx();
		testExpected = new ArrayList<String>();
		testExpected.add("(0,2,3,5)");
		testExpected.add("(1,2,4,5)");
		testExpected.add("(0,2,4,6)");
		assertEquals(testExpected, testOutput);
		
		testArray = new int[] {3,4};
		puzzle.setInputArray(testArray);
		testOutput = puzzle.findQuadrupletIdx();
		testExpected = new ArrayList<String>();
		assertEquals(testExpected, testOutput);
		
		testArray = null;
		puzzle.setInputArray(testArray);
		testOutput = puzzle.findQuadrupletIdx();
		testExpected = null;
		assertEquals(testExpected, testOutput);
	}
}
