/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int num = 0;
            int dec = 0;
            ListNode result = null;
            ListNode node = null;
            do {
                if (l1 != null && l2 != null) {
                    num = l1.val + l2.val + dec;
                    l1 = l1.next;
                    l2 = l2.next;
                } else if (l1 != null) {
                    num = l1.val + dec;
                    l1 = l1.next;
                } else if (l2 != null) {
                    num = l2.val + dec;
                    l2 = l2.next;
                }
                if (num >= 10) {
                    dec = 1;
                    num = num - 10;
                } else dec = 0;
                if (result == null) {
                    result = new ListNode(num);
                    node = result;
                } else {
                    node.next = new ListNode(num);
                    node = node.next;
                }
            } while (l1 != null || l2 != null);
            if (dec != 0) node.next = new ListNode(dec);
            return result;
        }
}