Binary Tree Zigzag Level Order Traversal
*****************************************
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }
        List<Integer> currentAns = new ArrayList<>(); 

        Stack<TreeNode> main = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();

        int level = 0;
        main.push(root);

        while(main.size()>0){
            TreeNode currentNode = main.pop();
            currentAns.add(currentNode.val);

            if(level == 0){
                if(currentNode.left!=null){
                    helper.push(currentNode.left);
                }
                if(currentNode.right!=null){
                    helper.push(currentNode.right);
                }

            }
            else{
                if(currentNode.right!=null){
                    helper.push(currentNode.right);
                }
                if(currentNode.left!=null){
                    helper.push(currentNode.left);
                }
            }
            if(main.size()==0){
                ans.add(currentAns);
                currentAns = new ArrayList<>();
                level=1-level;
                main=helper;
                helper = new Stack<>();
            }
        }
        return ans;
    }
}

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]

Example 2:

Input: root = [1]
Output: [[1]]

Example 3:

Input: root = []
Output: []
