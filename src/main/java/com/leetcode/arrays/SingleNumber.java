package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * #136 https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
    public static void main(String[] args) {
        int []arr = {5,4,3,5,4,3,1};
        System.out.println(singleNumber(arr));
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
}
