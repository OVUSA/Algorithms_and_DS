package Algorithms_and_DS.LinkedList;

import com.sun.source.tree.Tree;

public class TreeNode {
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

class Solution {
    TreeNode prev = null;
    public static void main(String[] args) {
        TreeNode tr = new TreeNode(5);
        tr.left = new TreeNode(1);
        tr.right = new TreeNode(4);
        tr.right.right = new TreeNode(7);
        tr.right.left = new TreeNode(3);

       System.out.println(isValidBST(tr));

    }
    public static boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }else{


        }
        return false;

    }

    }