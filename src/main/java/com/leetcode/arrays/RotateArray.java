package com.leetcode.arrays;

/**
 *
 */
public class RotateArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        int k  = 3;
        rotate(arr, k);
    }
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        int temp[] = new int[k];
        for(int i = size-1, j = k-1; i >= size-k; i--){
            temp[j--] = nums[i];
        }
        for(int i = size-k-1; i < size; i++){
            nums[i] = nums[i-k];
        }
    }
}
