package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given an array, remove an element and return the new length
 *
 * https://leetcode.com/problems/remove-element/
 *
 * testCase 1: arr[1,2,3,4,4,5] val = 6  => return 0
 *
 * testCase 2: arr[1,2,3,3,4,5] val = 2 => 5
 */
public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value to remove: ");
        int value = sc.nextInt();
        System.out.println(removeElement(arr, value));
    }

    public static int removeElement(int []arr, int value){
        List resultList = new ArrayList();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                continue;
            }else{
                resultList.add(arr[i]);
            }
        }
        return resultList.size();
    }
}
