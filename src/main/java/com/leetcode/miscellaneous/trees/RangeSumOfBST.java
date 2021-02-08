package com.leetcode.miscellaneous.trees;

/**
 * #938 https://leetcode.com/problems/range-sum-of-bst/
 *
 *  root = [10,5,15,3,7,null,18], low = 7, high = 15
 *  sum = 32
 *
 *  root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
 *  sum = 23
 */
public class RangeSumOfBST {

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);
        root.left.left.left = new TreeNode(1);
        root.left.right.left = new TreeNode(6);

        System.out.println(rangeSumBST(root, 6, 10));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
          if(root == null){
              return 0;
          }
          if(root.val < low){
              return rangeSumBST(root.right, low, high);
          }
          if(root.val > high){
              return rangeSumBST(root.left, low, high);
          }else{
              return root.val+rangeSumBST(root.left, low, high)+rangeSumBST(root.right, low, high);
          }
    }
}
