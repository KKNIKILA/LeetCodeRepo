class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int curs=0;
        int maxs=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int temp=curs+nums[i];
            if(temp<nums[i])
            {
                curs=nums[i];
            }
            else
            {
                curs=temp;
            }
            if(curs>maxs)
            {
                maxs=curs;
            }
        }
        return maxs;
    }
}