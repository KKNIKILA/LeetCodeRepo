class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length<=0)
        {
            return nums.length;
        }
        TreeSet<Integer> hs=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        int[] a=new int[hs.size()];
        int i1=0;
        for(int NumbeR:hs)
        {
            a[i1]=NumbeR;
            i1++;
        }
        int max=0;
        int c=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==(a[i+1]-1))
            {
                c++;
            }
            else
            {
                max=Math.max(max,c);
                c=1;
            }
        }
        if(max<c)
        {
            max=c;
        }
        return max;
    }
}