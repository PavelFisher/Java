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
 public boolean isSymmetric(TreeNode root) {
            Stack<TreeNode> branchLeft = new Stack<>();
            Stack<TreeNode> branchRight = new Stack<>();
            List<Integer> valuesLeft = new ArrayList<>();
            List<Integer> valuesRight = new ArrayList<>();
            TreeNode rootRight = root;
            while (root != null || !branchLeft.isEmpty() || !branchRight.isEmpty()) {
                valuesLeft.clear();
                valuesRight.clear();
                while (root != null) {
                    branchLeft.push(root);
                    valuesLeft.add(root.val);
                    root = root.left;
                }
                while (rootRight != null) {
                    branchRight.push(rootRight);
                    valuesRight.add(rootRight.val);
                    rootRight = rootRight.right;
                }
                if (!valuesLeft.equals(valuesRight)) return false;
                root = branchLeft.pop();
                root = root.right;
                rootRight = branchRight.pop();
                rootRight = rootRight.left;
            }
            return true;
        }
}