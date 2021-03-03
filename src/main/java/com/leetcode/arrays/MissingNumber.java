package com.leetcode.arrays;

/**
 * #268 https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public static void main(String[] args) {
        int []arr = {1,2};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumberWithoutExtraSpace(arr));
    }
    public static int missingNumber(int[] nums) {
        /**
         * TC: O(n)
         * SC: O(n)
         */
        int size = nums.length;
        int comp[] = new int[size+1];
        int compSum = 0, numsSum = 0;
        for(int i = 0; i <= size; i++){
            comp[i] = i;
            compSum += i;
        }
        for(int i = 0; i < nums.length; i++){
            numsSum += nums[i];
        }
        return compSum-numsSum;
    }
    public static int missingNumberWithoutExtraSpace(int []nums){
        /**
         * TC: O(n)
         * SC: O(1)
         */
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }
        return res;
    }
}
