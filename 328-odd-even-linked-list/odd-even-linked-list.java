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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        ListNode sec = head.next;
        ListNode secHead = head.next;
        while(sec!=null && sec.next!=null){
            temp.next = temp.next.next;
            temp = temp.next;
            sec.next = sec.next.next;
            sec = sec.next;
        }
        temp.next = secHead;
        return head;
    }
}