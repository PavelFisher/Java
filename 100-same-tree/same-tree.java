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
  public boolean isSameTree(TreeNode p, TreeNode q) {
            Stack<TreeNode> branchP = new Stack<>();
            Stack<TreeNode> branchQ = new Stack<>();
            List<Integer> valuesP = new ArrayList<>();
            List<Integer> valuesQ = new ArrayList<>();
            while (p != null || !branchP.isEmpty() || q != null || !branchQ.isEmpty()) {
                valuesP.clear();
                valuesQ.clear();
                while (p != null) {
                    branchP.push(p);
                    valuesP.add(p.val);
                    p = p.left;
                }
                while (q != null) {
                    branchQ.push(q);
                    valuesQ.add(q.val);
                    q = q.left;
                }
                if (!valuesP.equals(valuesQ)) return false;
                p = branchP.pop();
                p = p.right;
                q = branchQ.pop();
                q = q.right;
            }
            return true;
        }
}