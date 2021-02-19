package com.leetcode.arrays;

/**
 * #485 https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0};
        //{1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count += 1;
            }else{
                max = Math.max(count, max);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
