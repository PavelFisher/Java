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
        public void flatten(TreeNode root) {
            if (root == null) return;
            TreeNode rootCopy = root;
            TreeNode node = null;
            Stack<TreeNode> stack = new Stack<>();
            while (rootCopy != null || !stack.empty()) {
                if (!stack.empty()) {
                    rootCopy = stack.pop();
                }
                while (rootCopy != null) {
                    if (rootCopy.right != null) stack.push(rootCopy.right);
                    if (rootCopy == root) {
                    } else if (node == null) {
                        node = new TreeNode(rootCopy.val);
                        root.right = node;
                        root.left = null;
                    } else {
                        node.right = new TreeNode(rootCopy.val);
                        node = node.right;
                    }
                    rootCopy = rootCopy.left;
                }
            }
        }
}