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
        ListNode temp=head;
        int NumbeR=0;
        while(temp!=null)
        {
            NumbeR++;
            temp=temp.next;
        }
        if(NumbeR!=0)
        { 
            k=k%NumbeR;
        }
        for(int i=0;i<k;i++)
        {
            temp=head;
            if((temp==null)||(temp.next==null))
            {
                return head;
            }
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            ListNode dummy=temp.next;
            temp.next=null;
            dummy.next=head;
            head=dummy;
        }
        return head;
    }
}