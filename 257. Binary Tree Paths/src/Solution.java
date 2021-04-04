    import java.util.ArrayList;

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
            List<String> res = new ArrayList<String>();

            helper(root, "", res);
            return res;
        }

        public void helper(TreeNode node, String s, List<String> res) {
            if (node == null) {
                return;
            }

            String str = s + node.val;

            if (node.left == null && node.right == null) {
                res.add(str);
            }

            helper(node.left, str + "->", res);
            helper(node.right, str + "->", res);
        }
    }