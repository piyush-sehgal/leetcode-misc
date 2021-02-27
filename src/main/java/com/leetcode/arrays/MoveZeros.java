package com.leetcode.arrays;

/**
 * #283 https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeros {
    public static void main(String[] args) {
        int []arr = {0,1,0,3,12};
        moveZeros(arr);
        moveZerosNoExtraSpace();
    }
    public static void moveZeros(int []arr){
        /**
         * TC: O(n)
         * SC: O(n)
         */
        int size = arr.length;
        int []copy = new int[size];
        int start = 0, end = size-1;
        for(int i = 0; i < size; i++){
            if(arr[i] == 0){
                copy[end--] = arr[i];
            }else{
                copy[start++] = arr[i];
            }
        }
        for(int i = 0; i < size; i++){
            arr[i] = copy[i];
        }
    }

    public static void moveZerosNoExtraSpace(int []arr){
        /**
         * TC: O(n)
         * SC: O(1)
         */
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] == 0){
                if(arr[j] != 0){
                    arr[i] = arr[j];
                    arr[j] = 0;
                    i++;
                }
            }
            else{
                i++;
            }
        }
    }
}
