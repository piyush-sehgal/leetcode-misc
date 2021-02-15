package com.leetcode.miscellaneous.arrays;

import java.util.Arrays;

/**
 * #215 https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElement {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        int kthElement = 2;
        System.out.println(findKthLargest(arr, kthElement));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
