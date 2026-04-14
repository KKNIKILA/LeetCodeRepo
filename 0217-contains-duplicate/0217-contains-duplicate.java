class Solution
{
    public boolean containsDuplicate(int[] nums) 
    {
        boolean NumbeR=false;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!(hs.add(nums[i])))
            {
                NumbeR=true;
                return NumbeR;
            }
        }
        return NumbeR;
    }
}