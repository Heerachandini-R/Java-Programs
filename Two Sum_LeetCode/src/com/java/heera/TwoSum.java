package com.java.heera;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	private static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hMap.containsKey(target - nums[i])) {
				return new int[] { hMap.get(target - nums[i]), i };
			}
			hMap.put(nums[i], i);
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 22);
		System.out.println(Arrays.toString(result));
	}
}