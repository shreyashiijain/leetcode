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
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if(h1==null&&h2==null){
            return null;
        }
        if(h1==null){
            return h2;
        }
        else if(h2==null){
            return h1;
        }
        ListNode no1 = h1;
        ListNode no2 = h2;
        ListNode dum = new ListNode(-1);
        ListNode prev = dum;
        while(no1 != null && no2 != null){
            if(no1.val<no2.val){
                prev.next = no1;
                no1 = no1.next;
            }
            else if(no1.val>no2.val){
                prev.next = no2;
                no2 = no2.next;
            }
            else{
                prev.next = no1;
                no1 = no1.next;
            }
            prev = prev.next;
        }
        while(no1!=null){
            prev.next = no1;
            no1 = no1.next;
            prev = prev.next;
        }
        while(no2!=null){
            prev.next = no2;
            no2 = no2.next;
            prev = prev.next;
        }
        return dum.next;
    }
}