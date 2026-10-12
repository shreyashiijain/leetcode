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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode now = head;
        int sum = 0;
        while(temp!=null){
            sum += temp.val;
            if(temp.val==0 && temp.next==null){
                now.val = sum;
                sum = 0;
                now.next = null;
            }
            else if(temp.val==0){
                now.val = sum;
                sum = 0;
                now = now.next;
            }
            temp = temp.next;
        }
        return head;
    }
}