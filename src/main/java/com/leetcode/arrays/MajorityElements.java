package com.leetcode.arrays;

/**
 * #169 https://leetcode.com/problems/majority-element/
 */
public class MajorityElements {
    public static void main(String[] args) {
        int []arr = {1,2,2,2,2,3,4};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        /**
         * TC: O(n^2)
         * SC: O(1)
         */
        int majorityElement = nums.length/2;
        for(int num : nums){
            int count = 0;
            for(int element : nums){
                if(element == num){
                    count++;
                }
            }
            if(count > majorityElement){
                return num;
            }
        }
        return -1;
    }
}
