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
    public ListNode swapPairs(ListNode head) 
    {
        int NumbeR;
        if((head==null) || (head.next==null))
        {
            return head;
        }
        ListNode f=head;
        ListNode s=head.next;
        ListNode prev=null;
        head=s;
        while((f!=null) && (s!=null))
        {
            f.next=s.next;
            s.next=f;
            if(prev!=null)
            {
                prev.next=s;
            }
            prev=f;
            f=f.next;
            if(f!=null)
            {
                s=f.next;
            }
            else
            {
                s=null;
            }
        }
        return head;
    }
}