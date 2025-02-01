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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode newNode = null;
            if (head == null || head.next == null) return head;
            else {
                ListNode result = new ListNode(head.val);
                ListNode nextObject = head.next;
                do {
                    if (result.next == null) {
                        if (result.val != nextObject.val) {
                            newNode = new ListNode(nextObject.val);
                            result.next = newNode;
                        }
                    } else if (nextObject.val != newNode.val) {
                        newNode.next = new ListNode(nextObject.val);
                        newNode = newNode.next;
                    }

                    if (nextObject.next == null) break;
                    nextObject = nextObject.next;
                } while (nextObject != null);
                return result;
            }
        }
}