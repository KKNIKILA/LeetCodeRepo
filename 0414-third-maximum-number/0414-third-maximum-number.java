class Solution 
{
    public int thirdMax(int[] nums) 
    {
        HashSet<Integer> hs=new HashSet<>();
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            hs.add(nums[i]);
            if(hs.size()==3)
            {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}