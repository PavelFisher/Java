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
            if (root == null) return false;
            return sumNextNode(root, 0, targetSum);
        }

        public boolean sumNextNode(TreeNode root, int summ, int targetSum) {
            if (root == null) return false;
            if (root.left != null) if (sumNextNode(root.left, summ + root.val, targetSum)) return true;
            if (root.right != null) if (sumNextNode(root.right, summ + root.val, targetSum)) return true;
            if (root.left != null || root.right != null) return false;
            return targetSum == summ + root.val;
        }
}