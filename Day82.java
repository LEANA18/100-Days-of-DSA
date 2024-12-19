Binary Tree Paths
******************
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        else if(root.left == null && root.right == null){
            ans.add(""+root.val);
            return ans;
        }
        List<String> leftans = binaryTreePaths(root.left);
        List<String> rightans = binaryTreePaths(root.right);

        for(String str : leftans){
            ans.add(root.val+"->"+str);
        }
        for(String str : rightans){
            ans.add(root.val+"->"+str);
        }
        return ans;
    }
}

Example 1:

Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Example 2:

Input: root = [1]
Output: ["1"]
