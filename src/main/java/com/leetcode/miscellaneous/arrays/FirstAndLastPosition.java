package com.leetcode.miscellaneous.arrays;

/**
 * #34 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int []arr = {1};
        //{1,1,2,2,2,2,3,4,5,5,6};
        int target = 1;
        int []result = searchRange(arr, target);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        /**
         *  TC: O(n)
         *  Using linear search
         */
        int []result = {-1,-1};
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == target && index == 0) {
                result[index++] = i;
            }
            if (nums[i] == target) {
                result[index] = i;
            }
        }
        return result;
    }
}
