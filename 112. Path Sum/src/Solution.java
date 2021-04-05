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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    public boolean dfs(TreeNode node, int targetSum) {
        if (node == null) {
            return false;
        }

        targetSum -= node.val;
        if (targetSum == 0 && node.left == null && node.right == null) {
            return true;
        }

        return dfs(node.left, targetSum) || dfs(node.right, targetSum);
    }
}