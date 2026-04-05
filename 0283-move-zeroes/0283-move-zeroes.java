class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int i=0;
        int j=0;
        while(i<nums.length)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        for(int i1=j;i1<nums.length;i1++)
        {
            nums[i1]=0;
        }
        return;
    }
}