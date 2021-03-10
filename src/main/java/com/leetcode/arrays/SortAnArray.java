package com.leetcode.arrays;

/**
 * #912 https://leetcode.com/problems/sort-an-array/
 */
public class SortAnArray {
    public static void main(String[] args) {
        int arr[] = {-88, 65, -83, 1234,0,2};
        int result[] = sortArray(arr);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    public static void mergeSort(int []arr, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int ls = mid-left+1;
        int rs = right-mid;
        int []lA = new int[ls];
        int rA[] = new int[rs];
        for(int i = 0; i < ls; i++){
            lA[i] = arr[left+i];
        }
        for(int j = 0; j < rs; j++ ){
            rA[j] = arr[mid+1+j];
        }
        int i=0, j=0, k=left;
        while(i < ls && j < rs){
            if(lA[i] <= rA[j]){
                arr[k] = lA[i];
                i++;
            }else{
                arr[k] = rA[j];
                j++;
            }
            k++;
        }
        while(i < ls){
            arr[k] = lA[i];
            i++;
            k++;
        }
        while(j < rs){
            arr[k] = rA[j];
            j++;
            k++;
        }
    }
}
