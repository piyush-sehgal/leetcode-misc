package com.leetcode.stacks;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<Integer>();
        int []res = new int[n];

        st.push(0);

        for(int i = 1; i < n; i++){
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                res[st.pop()] = i;
            }
            st.push(i);
        }

        while(st.size() > 0){
            res[st.pop()] = 0;
        }

        for(int i = 0; i < n; i++){
            if(res[i] != 0){
                res[i] -= i;
            }
        }
        return res;
    }
}
