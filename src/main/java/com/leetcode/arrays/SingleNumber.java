package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * #136 https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
    public static void main(String[] args) {
        int []arr = {5,4,3,5,4,3,1};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumberOptimizedApproach(arr));
    }
    public static int singleNumber(int []arr){
        /**
         * TC: for loop -> O(n)
         *     ArrayList.contains() -> O(n)
         *     O(n) * O(n) = O(n^2)
         * SC: O(n)
         */
        List<Integer> singleList = new ArrayList<Integer>();
        for(int i : arr){
            if(!singleList.contains(i)){
                singleList.add(i);
            }else{
                singleList.remove(new Integer(i));
            }
        }
        return singleList.get(0);
    }

    public static int singleNumberOptimizedApproach(int []arr){
        /**
         * Using set
         * 2 ∗ (a+b+c) − (a+a+b+b+c) = c
         * 2 * sumOfSet - sumOfNums
         *
         * TC: set.contains() -> O(1)
         *     for -> O(n)
         *    O(n) * O(1) = O(n)
         * SC: O(n)
         */
        Set<Integer> set = new HashSet<Integer>();
        int sumOfSet = 0, sumOfNums = 0;
        for(int i: arr){
            if(!set.contains(i)){
                set.add(i);
                sumOfSet += i;
            }
            sumOfNums += i;
        }
        return 2 * sumOfSet - sumOfNums;
    }
}
