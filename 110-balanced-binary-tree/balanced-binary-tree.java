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
        public boolean isBalanced(TreeNode root) {
            int[] difference = new int[]{0};
            int deep = getDeep(root, difference);
            if (difference[0] > 1) return false;
            else return true;

        }

        public int getDeep(TreeNode tree, int[] difference) { 
            if (tree == null) return 0;
            int left = getDeep(tree.left, difference);
            int right = getDeep(tree.right, difference);
            difference[0] = Math.max(difference[0], Math.abs(left - right));

            return Math.max(left, right) + 1;
        }
}