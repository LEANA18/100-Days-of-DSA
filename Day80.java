Binary Tree Postorder Traversal
*******************************
Given the root of a binary tree, return the postorder traversal of its nodes' values.

Program
********
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;
    }
    public void helper(TreeNode root, List<Integer>list){
        if(root == null){
            return;
        }
        helper(root.left,list);
        helper(root.right,list);

        list.add(root.val);
    }
}

Example 1:

Input: root = [1,null,2,3]
Output: [3,2,1]

Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,6,7,5,2,9,8,3,1]

Example 3:

Input: root = []
Output: []

Example 4:

Input: root = [1]
Output: [1]
