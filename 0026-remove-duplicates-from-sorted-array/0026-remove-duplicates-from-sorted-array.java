class Solution 
{
    public int removeDuplicates(int[] nums)
    {
        int i=0;
        int NumbeR=0;
        while(i<nums.length)
        {
            if(nums[i]!=nums[NumbeR])
            {
                NumbeR++;
                nums[NumbeR]=nums[i];
            }
            i++;
        }
        NumbeR++;
        return NumbeR;
    }
}