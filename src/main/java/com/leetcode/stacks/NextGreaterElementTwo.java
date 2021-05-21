package com.leetcode.stacks;

import java.util.Arrays;
import java.util.Stack;

/**
 *  # 503
 */
public class NextGreaterElementTwo {
    public static void main(String[] args) {
        //int []arr = {1, 2, 1};
        int []arr = {0, -2, -3};
        int res[] = nextGreaterElements(arr);

        System.out.println(Arrays.toString(res));
    }
    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int []res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = Integer.MIN_VALUE;
        }
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);
        for(int i = 1; i < n; i++){
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        for(int i = 0; i < n; i++){
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                res[st.pop()] = arr[i];
            }
            if(st.size() > 0 && st.peek() == i){
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0){
            int val = st.pop();
            if(res[val] == Integer.MIN_VALUE){
                res[val] = -1;
            }
        }
        return res;
    }
}
