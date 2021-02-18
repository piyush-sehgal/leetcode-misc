package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *  #349 https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5,6};
        int []arr2 = {2,3,4,5};
        int []result = intersection(arr1,arr2);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        // TC: O(n*m)
//        List<Integer> result = new ArrayList<Integer>();
//        if(nums1.length == 0 || nums2.length == 0){
//            return new int[0];
//        }
//        for(int i = 0; i < nums1.length; i++){
//            for(int j  = 0; j < nums2.length; j++){
//                if(nums1[i] == nums2[j]){
//                    if(result.contains(nums1[i])){
//                        continue;
//                    }
//                    result.add(nums1[i]);
//                }
//            }
//        }
//        int []resultArr = new int[result.size()];
//        for(int i = 0; i < result.size(); i++){
//            resultArr[i] = result.get(i);
//        }
//        return resultArr;

        // TC: O(n)  SC: O(n)
        Set<Integer> set1 = new HashSet<Integer>();
        for(int a: nums1){
            set1.add(a);
        }
        Set<Integer> result = new HashSet<Integer>();

        for(int i = 0; i < nums2.length; i++){
            if(set1.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int i = 0;
        int []resultArray = new int[result.size()];
        for(int a : result){
            resultArray[i++] = a;
        }
        return resultArray;
    }
}
