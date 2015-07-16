package main;

import java.util.Arrays;

public class Programa {

	public static void main(String[] args) {
		int[] nums = { 32, 15, 3, 23, 4, 0, 1 };
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums [" + i + "]=" + nums[i] + "\n");
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums [" + i + "]=" + nums[i] + "\n");
		}
	}

}
