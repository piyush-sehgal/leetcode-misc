package com.leetcode.arrays;

/**
 * #1295 https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int []arr = {12,2,120,32};
        System.out.println(getNumberOfDigits(arr));
    }
    public static int getNumberOfDigits(int []nums){
        int result = 0;
        for(int num : nums){
            int numberOfDigits = 0;
            while(num != 0){
                num /= 10;
                numberOfDigits++;
            }
            if(numberOfDigits % 2 == 0){
                result++;
            }
        }
        return result;
    }
}
