class Solution 
{
    public int longestSubarray(int[] nums) 
    {
        int max=0;
        int k=0;
        int ws=0;
        int count=0;
        for(int we=0;we<nums.length;we++)
        {
            if(nums[we]==1)//3
            {
                count++;
            }
            else
            {
                k++;
            }
            while(k>1)//k=2
            {
                if(nums[ws]==0)
                {
                    k--;
                }
                else
                {
                    count--;
                }
                ws++;
            }
            max=Math.max(max,count);
        }
        return (max==nums.length)?nums.length-1:max;
    }
}