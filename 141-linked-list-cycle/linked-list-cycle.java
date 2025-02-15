/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
                    List<Integer> hashList = new ArrayList<>();
            int hash = 0;
            while (head != null) {
                hash = head.hashCode();
                if (hashList.contains(hash)) return true;
                if (head.next == null) return false;
                hashList.add(hash);
                head = head.next;
            }
            return false;
    }
}