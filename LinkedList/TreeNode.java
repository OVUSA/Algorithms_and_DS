package Algorithms_and_DS.LinkedList;

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
        }else {
            if (root.right != null) {
                if (root.val < root.right.val) {
                    isValidBST(root.right);
                }else{
                    return false;
                }
            }
            if (root.left != null) {
                if (root.val > root.left.val) {
                    isValidBST(root.left);
                }else{
                    return false;
                }
            }

        }
        return true;
        }
    }