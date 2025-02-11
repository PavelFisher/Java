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

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> result = new ArrayList<>();
            pathSumNextNode(root, 0, targetSum, result, new ArrayList<>());
            return result;
        }

        public void pathSumNextNode(TreeNode root, int summ, int targetSum, List<List<Integer>> result, List<Integer> currentPathSum) {
            if (root == null) return;
            currentPathSum.add(root.val);
            List<Integer> savePath = new ArrayList<>();
            savePath.addAll(currentPathSum);
            if (root.left != null) {
                pathSumNextNode(root.left, summ + root.val, targetSum, result, currentPathSum);
            }
            if (root.right != null) {
                currentPathSum = savePath;
                pathSumNextNode(root.right, summ + root.val, targetSum, result, currentPathSum);
            }
            if (root.left != null || root.right != null) return;
            if (targetSum == summ + root.val) result.add(currentPathSum);
        }
}