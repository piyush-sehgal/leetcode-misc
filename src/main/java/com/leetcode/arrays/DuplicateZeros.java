package com.leetcode.arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int []arr = {0,1,0};
        duplicateZeros(arr);
    }
    public static void duplicateZeros(int[] arr) {
        int countZeros = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                countZeros++;
            }
        }
        int []temp = new int[arr.length+countZeros];
        for(int i = 0, j = 0; i < arr.length; i ++){
            if(arr[i] == 0){
                temp[j] = arr[i];
                j += 1;
                temp[j] = 0;
            }else{
                temp[j++] = arr[i];
            }
        }
        for(int i = 0, j = 0; i < arr.length; i ++){
            arr[i]=temp[j++];
        }
    }
}
