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
//        int []result = {-1,-1};
//        int index = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if (nums[i] == target && index == 0) {
//                result[index++] = i;
//            }
//            if (nums[i] == target) {
//                result[index] = i;
//            }
//        }
//        return result;

        /**
         * Using binary search
         * TC: 0(logN)
         * SC: O(1)
         */
        int leftIndex = getIndex(nums, target, true);
        int rightIndex = getIndex(nums, target, false);
        return new int[]{leftIndex,rightIndex};

    }
    public static int getIndex(int []arr, int target, boolean goLeft){
        int index = -1;
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                index = mid;
                if(goLeft){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }
}
