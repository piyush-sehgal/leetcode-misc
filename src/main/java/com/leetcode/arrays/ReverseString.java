package com.leetcode.arrays;

/**
 * #344 https://leetcode.com/problems/reverse-string/solution/
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        reverseString(str);
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i]+ " ");
        }
    }
    public static void reverseString(char []str){
        /**
         * TC: O(n)
         * SC: O(n)
         */
        char []result = new char[str.length];
        int j = str.length-1;
        for(int i = 0; i < str.length; i++){
            result[j--] = str[i];
        }
        for(int i = 0; i < str.length; i++){
            str[i] = result[i];
        }
    }
}
