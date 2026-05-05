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
    public ListNode rotateRight(ListNode head, int k) 
    {
        int NumbeR=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            NumbeR++;
        }
        if((head==null) || (head.next==null))
        {
            return head;
        }
        k=k%NumbeR;
        for(int i=0;i<k;i++)
        {
            ListNode t=head;
            while(t.next.next!=null)
            {
                t=t.next;
            }
            t.next.next=head;
            head=t.next;
            t.next=null;
        }
        return head;
    }
}