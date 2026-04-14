class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int l=0;
        int r=0;
        int NumbeR;
        for(int i=0;i<nums.length;i++)
        {
            r=r+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            r=r-nums[i];
            if(l==r)
            {
                return i;
            }
            l=l+nums[i];
        }
        return -1;
    }
}