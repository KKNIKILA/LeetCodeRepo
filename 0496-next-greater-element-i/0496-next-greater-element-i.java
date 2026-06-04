class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int NumbeR;
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            //peek a vida greater a ethathu element iruntha pop because peek is greater than all or equal
            //if something is less than peek push it so we push it in last 
            while((!st.isEmpty())&&(st.peek()<=nums2[i]))
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                hm.put(nums2[i],-1);
            }
            else
            {
                hm.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int[] answer=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            answer[i]=hm.get(nums1[i]);
        }
        return answer;
    }
}