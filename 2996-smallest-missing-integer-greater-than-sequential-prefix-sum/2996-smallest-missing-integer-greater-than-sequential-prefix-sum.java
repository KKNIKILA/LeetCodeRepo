class Solution 
{
    public int missingInteger(int[] nums) 
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        int sum=0;
        int i1=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1==nums[i+1])
            {
                sum=sum+nums[i];
            }
            else
            {
                break;
            }
            i1++;
        }
        sum=sum+nums[i1];
        while(hs.contains(sum))
        {
            sum=sum+1;
        }
        return sum;
    }
}
