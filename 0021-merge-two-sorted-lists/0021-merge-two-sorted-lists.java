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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode res=null;
        ListNode head=null;
        while((list1!=null) && (list2!=null))
        {
            if(list1.val>list2.val)
            {
                if(res==null)
                {
                    res=list2;
                    head=list2;
                }
                else
                {
                    res.next=list2;
                    res=res.next;
                }
                list2=list2.next;
            }
            else
            {
                if(res==null)
                {
                    res=list1;
                    head=list1;
                }
                else
                {
                    res.next=list1;
                    res=res.next;
                }
                list1=list1.next;
            }
        }
        if(list1!=null)
        {
            if(res==null)
            {
                res=list1;
                head=list1;
            }
            else
            {
                res.next=list1;
            }
        }
        if(list2!=null)
        {
            if(res==null)
            {
                res=list2;
                head=list2;
            }
            else
            {
                res.next=list2;
            }
        }
        return head;
    }
}