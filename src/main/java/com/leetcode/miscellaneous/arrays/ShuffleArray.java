package com.leetcode.miscellaneous.arrays;

/**
 * #1470 https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleArray {
    /**
     *  n = 3
     *  nums = [1,2,3,4,5,6]
     *  o/p : [1,4,2,5,3,6]
     *
     *  n = 2
     *  nums = [1,1,2,2]
     *  o/p : [1,2,1,2]
     *
     */
    public static void main(String[] args) {
        int n = 3;
        int []nums = {1,2,3,4,5,6};
        int []result = shuffle(nums, n);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int []result = new int[2*n];
        int []left = new int[n];
        int []right = new int[n];
        for(int i = 0; i < n; i++){
            left[i] = nums[i];
        }
        for(int i = 0, j=n; i < n; i++){
            right[i] = nums[j++];
        }
        for(int i = 0, j = 0, k = 0; i < nums.length; i++){
            if(i%2 == 0){
                result[i] = left[j++];
            }else{
                result[i] = right[k++];
            }
        }
        return result;
    }
}
