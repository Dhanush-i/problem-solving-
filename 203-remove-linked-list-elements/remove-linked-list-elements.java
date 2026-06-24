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
    public ListNode removeElements(ListNode head, int v) {
        while(head!=null && head.val==v)
            head=head.next;
        ListNode i=head;
        while(i!=null && i.next!=null){
            if(i.next.val==v)
                i.next=i.next.next;
            else
                i=i.next;
        }
        return head;
    }
}