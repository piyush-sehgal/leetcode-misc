package com.leetcode.common;

/**
 * https://leetcode.com/problems/palindrome-number/
 */

public class Palindrome {
    public static void main(String[] args) {
        int a = 123;
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0){
        return false;
    }
    int temp = x;
    int rev = 0;
        while( temp != 0){
        int num = temp % 10;
        rev = rev * 10 + num;
        temp /= 10;
    }
        if(rev == x){
        return true;
    }
        else{
        return false;
    }
}
}
