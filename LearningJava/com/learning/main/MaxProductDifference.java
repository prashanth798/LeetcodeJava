package com.learning.main;

import java.util.Arrays;

public class MaxProductDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] someArr = {6,2,4,5,3};
		int result = maxProductDifference(someArr);
		System.out.println(result);
	}
	
	public static int maxProductDifference(int[] nums) {
        int result = 0;
        int len = nums.length;
         Arrays.sort(nums);
         
         result = (nums[len-1] * nums[len-2]) - (nums[0]* nums[1]);
         for(int a: nums) {
        	 System.out.println(a);
         }
		return result;
    }

}
