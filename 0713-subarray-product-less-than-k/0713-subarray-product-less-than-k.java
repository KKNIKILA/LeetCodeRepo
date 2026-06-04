class Solution 
{
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int ws=0;
        int count=0;
        int pro=1;
        if(k<=1)
        {
            return 0;
        }
        for(int we=0;we<nums.length;we++)
        {
            pro=pro*nums[we];
            while(pro>=k)
            {
                pro=pro/nums[ws];
                ws++;
            }
            count=count+we-ws+1;
        }
        return count;
    }
}