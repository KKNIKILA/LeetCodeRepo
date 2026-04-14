class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        if(nums[0]==nums[nums.length-1])
        {
            return 1;
        }
        int i=0;
        int k=0;
        int NumbeR;
        while(i<nums.length-1)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        if(nums.length>=2)
        {
            nums[k]=nums[nums.length-1];
            k++;
        }
        return k;
    }
}