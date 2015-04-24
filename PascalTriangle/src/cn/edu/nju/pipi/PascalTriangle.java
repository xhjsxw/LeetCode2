package cn.edu.nju.pipi;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);
		print(generate(Integer.MAX_VALUE));
	}

	public static List<List<Integer>> generate(int numRows) {
		if (numRows <= 0) {
			new ArrayList<List<Integer>>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> currentRow = new ArrayList<Integer>();
		List<Integer> previousList = new ArrayList<Integer>();
		currentRow.add(1);
		previousList = currentRow;
		result.add(currentRow);
		for (int i = 1; i < numRows; i++) {
			currentRow = new ArrayList<Integer>();
			currentRow.add(1);
			for (int j = 1; j < i; j++) {
				currentRow.add(previousList.get(j - 1) + previousList.get(j));
			}
			currentRow.add(1);
			result.add(currentRow);
			previousList = currentRow;
			currentRow = null;
		}
		currentRow = null;
		previousList = null;
		return result;
	}
	public static List<List<Integer>> generateImprovement(int numRows) {
		if (numRows <= 0) {
			return null;
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> currentRow = new ArrayList<Integer>();
		//List<Integer> previousList = new ArrayList<Integer>();
		currentRow.add(1);
		//previousList = currentRow;
		result.add(currentRow);
		int left = 1;
		int right = 1;
		//int priviousLeft = 1;
		//int priviousRight = 1;
		for (int i = 1; i < numRows; i++) {
			currentRow = new ArrayList<Integer>();
			currentRow.add(1);
			for (int j = 1; j < i; j++) {
				currentRow.add(left + right);
				left = right;
				
			}
			currentRow.add(1);
			result.add(currentRow);
			//previousList = currentRow;
			currentRow = null;
		}
		currentRow = null;
		//previousList = null;
		return result;
	}


	public static void print(List<List<Integer>> result) {
		if (result != null) {
			for (List<Integer> list : result) {
				System.out.println(list);
			}
		}
	}
}
