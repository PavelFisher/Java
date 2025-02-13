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
   public ListNode removeNthFromEnd(ListNode head, int n) {
            int deep = 0;
            int counter = 0;
            ListNode copyHead = head;
            ListNode result = null;
            while (head != null) {
                head = head.next;
                deep++;
            }
            head = copyHead;

            while (head != null) {
                if (deep - counter == n) {
                    counter++;
                    head = head.next;
                    continue;
                }
                counter++;
                if (result == null) result = new ListNode(head.val);
                else if (result.next == null) {
                    copyHead = new ListNode(head.val);
                    result.next = copyHead;
                } else {
                    copyHead.next = new ListNode(head.val);
                    copyHead = copyHead.next;
                }
                head = head.next;
            }
            return result;
        }
}