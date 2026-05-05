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
class Solution 
{
    public ListNode oddEvenList(ListNode head) 
    {
        int NumbeR;
        if((head==null) || (head.next==null))
        {
            return head;
        }
        ListNode o=head;
        ListNode e=head.next;
        ListNode i=e;
        while((o.next!=null) && (e.next!=null))
        {
            o.next=o.next.next;
            e.next=e.next.next;
            o=o.next;
            e=e.next;
        }
        o.next=i;
        return head;
    }
}