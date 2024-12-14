Symmetric Tree
*************
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Program
*******
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean Helper(TreeNode root1,TreeNode root2){
        if(root1 == null || root2==null){
            return root1 == root2;
        }
        if(root1.val == root2.val){
            boolean ans1 = Helper(root1.left,root2.right);
            boolean ans2 = Helper(root1.right,root2.left);
            return ans1 && ans2;
        }
        else{
            return false;
        }
    }
    public boolean isSymmetric(TreeNode root) {
       if(root == null){
            return true;
       }
       return Helper(root.left,root.right); 
       
    }
}

Example 1:

Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:

Input: root = [1,2,2,null,3,null,3]
Output: false
 
