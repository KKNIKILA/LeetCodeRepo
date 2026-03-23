/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode temp=headA;
        int c1=0;
        while(temp!=null)
        {
            temp=temp.next;
            c1++;
        }
        temp=headB;
        int c2=0;
        while(temp!=null)
        {
            temp=temp.next;
            c2++;
        }
        ListNode t1=headA;
        ListNode t2=headB;
        if(c1>c2)
        {
            for(int i=0;i<c1-c2;i++)
            {
                t1=t1.next;
            }
        }
        else
        {
            for(int i=0;i<c2-c1;i++)
            {
                t2=t2.next;
            }
        }
        while(t1!=t2)
        {
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
}