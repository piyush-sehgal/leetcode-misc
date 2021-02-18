package com.leetcode.arrays;

import java.util.Arrays;

/**
 * #1464 https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 */
public class MaxProductOfTwoElements {
    public static void main(String[] args) {
        int []arr = {1,5,4,5,1,2,3,4,5,6,7,8,9,56,43,2,212,34,3};
        System.out.println(maxProduct(arr));
    }
    static int maxProduct(int []arr){
        Arrays.sort(arr);
        return ((arr[arr.length-1]-1) * (arr[arr.length-2]-1));
    }
}
