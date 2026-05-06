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
    public ListNode removeElements(ListNode head, int val) 
    {
        int NumbeR;
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null)
        {
            ListNode ne=cur.next;
            if(cur.val==val)
            {
                if(prev==null)
                {
                    head=ne;
                }
                else
                {
                    prev.next=ne;
                }
            }
            else
            {
                prev=cur;
            }
            cur=ne;
        }
        return head;
    }
}