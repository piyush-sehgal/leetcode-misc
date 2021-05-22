package com.leetcode.stacks;

import java.util.Stack;

/**
 * #85 Maximal rectangle
 */
public class MaximalRectangle {

    public static int[] leftSmallerIndex(int []arr){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        st.push(n - 1);
        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                res[st.pop()] = i;
            }
            st.push(i);
        }
        while(st.size() > 0){
            res[st.pop()] = -1;
        }
        return res;
    }

    public static int[] rightSmallerIndex(int []arr){
        int n = arr.length;
        int[] res = new int[n];

        Stack<Integer> st = new Stack<Integer>();
        st.push(0);

        for(int i = 1; i < n; i++){
            while(st.size() > 0 && arr[st.peek()] > arr[i]){
                res[st.pop()] = i;
            }
            st.push(i);
        }

        while(st.size() > 0){
            res[st.pop()] = n;
        }
        return res;
    }

    //lsi -> left smaller index, by default: -1
    //rsi -> right smaller index, by default: arr.length(to calculate width)
    public static int largestAreaHistogram(int []arr){
        int n = arr.length;
        int area = 0;

        //1. finding left smaller index
        int lsi[] = leftSmallerIndex(arr);

        //2. finding right smaller index
        int rsi[] = rightSmallerIndex(arr);

        //3. calculating and filling res(area) array.
        for(int i = 0; i < n; i++){
            int width = rsi[i] - lsi[i] -1;
            int height = arr[i];
            area = Math.max(area, width * height);
        }
        return area;
    }

    // #85 leetcode -> maximal rectangle
    public static int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int res = 0;
        int arr[] = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == '0'){
                    arr[j] = 0;
                } else {
                    arr[j] += matrix[i][j] - '0'; //or arr[j] += 1
                }
            }
            res = Math.max(res, largestAreaHistogram(arr));
        }
        return res;
    }

    public static void main(String[] args) {
        char arr[][] = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int res = maximalRectangle(arr);
        System.out.println(res);
    }
}
