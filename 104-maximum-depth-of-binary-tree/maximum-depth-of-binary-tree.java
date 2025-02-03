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
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            return countDepth(root, 0, 0);
        }

        public int countDepth(TreeNode root, int depth, int currentDepth) {
            if (root == null) return Math.max(currentDepth + 1, depth);
            if (root.left != null) depth = countDepth(root.left, depth, currentDepth + 1);
            if (root.right != null) depth = countDepth(root.right, depth, currentDepth + 1);
            return Math.max(currentDepth + 1, depth);
        }
}