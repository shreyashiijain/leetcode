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
    static ListNode reverseLLBetter(ListNode head){
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode next = curr.next; // Temporary variable inside the loop
                curr.next = prev;          // Reverse the link
                prev = curr;               // Move prev forward
                curr = next;               // Move curr forward
            }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secHead = reverseLLBetter(slow.next);;
        slow.next = secHead;
        ListNode first = head;
        ListNode sec = secHead;
        boolean ans = true;
        while(sec!=null){
            if(first.val != sec.val){
                ans = false;
                break;
            }
            sec = sec.next;
            first = first.next;
        }
        slow.next = reverseLLBetter(secHead);
        return ans;
    }
}