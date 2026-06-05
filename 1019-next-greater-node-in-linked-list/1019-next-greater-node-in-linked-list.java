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
    public int[] nextLargerNodes(ListNode head) 
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        int index=count-1;
        int[] newarr=new int[count]; 
        Stack<Integer> s=new Stack<>();
        temp=prev;
        while(temp!=null)
        {
            while((!s.isEmpty()) && (s.peek()<=temp.val))
            {
                s.pop();
            }
            if((!s.isEmpty()) && (s.peek()>temp.val))
            {
                newarr[index--]=s.peek();
            }
            else
            {
                newarr[index--]=0;
            }
            s.push(temp.val);
            temp=temp.next;
        }
        return newarr;   
    }
}