package com.leetcode.arrays;

/**
 * #344 https://leetcode.com/problems/reverse-string/solution/
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        char[] str2 = {'h','e','l','l','o'};
        reverseString(str);
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i]+ " ");
        }
        System.out.println();
        revereStringInPlace(str2);
        for(int i = 0; i < str2.length; i++){
            System.out.print(str2[i]+ " ");
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
    public static void revereStringInPlace(char []str){
        /**
         * TC: O(n)
         * SC: O(1)
         */
        int start = 0, end = str.length-1;
        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
