Binary Tree Level Order Traversal
*******************************
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>  currentAns = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> main = new ArrayDeque<>();
        Queue<TreeNode> helper = new ArrayDeque<>();

        main.add(root);
        while(main.size()>0){
            TreeNode currentNode = main.remove();
            currentAns.add(currentNode.val);

            if(currentNode.left!=null){
                helper.add(currentNode.left);
            }
            if(currentNode.right!=null){
                helper.add(currentNode.right);
            }
            if(main.size()==0){
                ans.add(currentAns);
                currentAns = new ArrayList<>();

                main = helper;
                helper = new ArrayDeque<>();
            }
        }
        return ans;
    }
}

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Example 2:

Input: root = [1]
Output: [[1]]

Example 3:

Input: root = []
Output: []
