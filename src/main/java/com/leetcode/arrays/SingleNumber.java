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
        System.out.println(singleNumberBitManipulation(arr));
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

    public static int singleNumberBitManipulation(int []arr){
        /**
         * If we take XOR of zero and some bit, it will return that bit
         *      a ⊕ 0 = a
         * If we take XOR of two same bits, it will return 0
         *      a ⊕ a = 0
         *
         * a⊕b⊕a=(a⊕a)⊕b=0⊕b=b
         * TC: O(n)
         * SC: O(1)
         */
        int a = 0;
        for (int i : arr) {
            a ^= i;
        }
        return a;
    }
}
