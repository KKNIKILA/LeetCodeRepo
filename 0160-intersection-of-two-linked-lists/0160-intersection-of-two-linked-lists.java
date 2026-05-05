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
        int NumbeR;
        int c1=0;
        int c2=0;
        ListNode t1=headA;
        while(t1!=null)
        {
            c1++;
            t1=t1.next;
        }
        ListNode t2=headB;
        while(t2!=null)
        {
            c2++;
            t2=t2.next;
        }
        t1=headA;
        t2=headB;
        int c11=(c1<c2)?0:c1-c2;
        int c22=(c2<c1)?0:c2-c1;
        for(int i=0;i<c11;i++)
        {
            t1=t1.next;
        }
        for(int i=0;i<c22;i++)
        {
            t2=t2.next;
        }
        while(t1!=t2)
        {
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
}