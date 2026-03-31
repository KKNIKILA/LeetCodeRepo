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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) 
    {
        ListNode temp=list1;
        int i=1;
        while(i<a)
        {
            temp=temp.next;
            i++;
        }
        int NumbeR=b-a+1;
        ListNode n=temp;
        i=1;
        while(i<=NumbeR)
        {
            n=n.next;
            i++;
        }
        temp.next=list2;
        while(list2.next!=null)
        {
            list2=list2.next;
        }
        list2.next=n.next;
        return list1;
    }
}